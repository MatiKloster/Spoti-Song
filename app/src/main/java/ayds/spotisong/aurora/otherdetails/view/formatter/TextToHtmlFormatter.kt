package ayds.spotisong.aurora.otherdetails.view.formatter

import android.text.Spanned

interface TextToHtmlFormatter {
    fun textToHtml(text: String, term: String): String
    fun htmlToText(htmlText: String?): Spanned
}
