package ayds.spotisong.aurora.otherdetails.view

import android.content.Intent
import android.os.Bundle
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v7.app.AppCompatActivity
import ayds.spotisong.aurora.R
import ayds.spotisong.aurora.otherdetails.presenter.OtherInfoPresenter
import ayds.spotisong.aurora.otherdetails.view.viewpager.ServiceInfoPagerAdapter
import ayds.spotisong.aurora.otherdetails.view.viewpager.ServiceInfoPagerAdapterModule
import ayds.spotisong.aurora.song.model.Song
import kotlinx.android.synthetic.main.activity_other_info.*

private const val EXTRA_NAME = "extra_name"
private const val EXTRA_ARTIST = "extra_artist"
private const val EXTRA_ALBUM = "extra_album"
private const val EXTRA_URL = "extra_url"

internal class OtherInfoActivity : AppCompatActivity(), OtherInfoView {
    private lateinit var presenter: OtherInfoPresenter
    private lateinit var artistName: String
    private var adapter: ServiceInfoPagerAdapter = ServiceInfoPagerAdapterModule.getServiceInfoPagerAdapter(supportFragmentManager)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_other_info)

        OtherInfoViewModule.setOtherInfoView(this, applicationContext)
        viewPager.setAdapter(adapter as FragmentStatePagerAdapter)

        val song = getSong(intent)
        presenter.onInit(song)
    }

    private fun getSong(intent: Intent): Song {
        artistName = intent.getStringExtra(EXTRA_ARTIST)
        val songName = intent.getStringExtra(EXTRA_NAME)
        val albumName = intent.getStringExtra(EXTRA_ALBUM)
        val url = intent.getStringExtra(EXTRA_URL)

        return Song(songName, artistName, albumName, url)

    }

    override fun showSearchResults(searchResults: List<CardView>) {
        adapter.showSearchResults(searchResults)
        viewPager.post { viewPager.adapter!!.notifyDataSetChanged() }
    }

    override fun setOtherInfoPresenter(presenter: OtherInfoPresenter) {
        this.presenter = presenter
    }

    override fun mostrarError(cadenaDeError: String) {
        adapter.mostrarError(cadenaDeError)
        viewPager.post { viewPager.adapter!!.notifyDataSetChanged() }
    }
}