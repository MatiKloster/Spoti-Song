package ayds.spotisong.aurora.otherdetails.view.formatter

import android.text.Html
import android.text.Spanned

internal class TextToHtmlFormatterImp: TextToHtmlFormatter {

    override fun textToHtml(text: String, term: String): String {
        val builder = StringBuilder()
        val textWithBold = text.replace("(?i)$term".toRegex(), "<b>$term</b>")
        builder.append(textWithBold)

        return builder.toString()
    }

    override fun htmlToText(htmlText: String?): Spanned {
        return Html.fromHtml(htmlText)
    }
}