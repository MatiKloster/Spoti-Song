package ayds.spotisong.aurora.otherdetails.view.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import android.text.Spanned
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import ayds.spotisong.aurora.R
import ayds.spotisong.aurora.otherdetails.view.formatter.TextToHtmlModule

import com.squareup.picasso.Picasso

const val SOURCE_KEY = "source"
const val TEXT_KEY = "text"
const val IMAGE_KEY = "imagePath"

internal class ServiceInfoFragmentImp : Fragment() {
    private var source: Int = 0
    private var text: Spanned? = null
    private var imagePath: String? = null
    private val formatter = TextToHtmlModule.getTextToHtmlFormatter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        loadArguments()
    }

    private fun loadArguments() {
        source = arguments!!.getInt(SOURCE_KEY)

        val textFromArgs = arguments!!.getString(TEXT_KEY)
        if (textFromArgs!=null)
            text = formatter.htmlToText(textFromArgs)

        imagePath = arguments!!.getString(IMAGE_KEY)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.service_result_info, container, false)

        mostrarTitulo(view)

        mostrarTexto(view)

        mostrarImagen(view)

        esconderBarraDeProgreso(view)

        return view
    }

    private fun mostrarTitulo(view: View) {
        if (text != null) {
            val title = view.findViewById<TextView>(R.id.title)

            if (source == 0)
                title.text = getResources().getString(R.string.data_from_lastfm)
            else if (source == 1)
                title.text = getResources().getString(R.string.data_from_lyricsdb)
            else
                title.text = getResources().getString(R.string.data_from_discogs)
        }
    }

    private fun mostrarTexto(view: View) {
        val textContainer = view.findViewById<TextView>(R.id.contenedorDeTexto)
        textContainer.text = text
    }

    private fun mostrarImagen(view: View) {
        if (imagePath != null) {
            val imageView = view.findViewById<ImageView>(R.id.image)
            Picasso.get().load(imagePath).into(imageView)
        }
    }

    private fun esconderBarraDeProgreso(view: View) {
        if (text != null) {
            val progressBar = view.findViewById<ProgressBar>(R.id.progressBar)
            progressBar.visibility = View.GONE
        }
    }
}
