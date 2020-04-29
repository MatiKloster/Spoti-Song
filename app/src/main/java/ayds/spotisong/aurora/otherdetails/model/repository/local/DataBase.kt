package ayds.spotisong.aurora.otherdetails.model.repository.local

import ayds.spotisong.aurora.otherdetails.model.Card

interface DataBase {
    fun saveCardInfo(cardName: String, card: Card)
    fun getCard(cardName: String): Card
    fun getInfo(cardName: String): String?
    fun getImageUrl(cardName: String): String?
    fun getSource(cardName: String) : Int
}
