package ayds.spotisong.aurora.otherdetails.model.repository

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.local.DataBase
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.Broker
import ayds.spotisong.aurora.song.model.Song
import java.util.*

private const val EXISTE_EN_DB_TAG = "[*]"

internal class OtherInfoRepositoryImp(private val dataBase: DataBase,private val broker: Broker, private val helper: KeyHelper) : OtherInfoRepository{

    override fun getCards(song: Song): List<Card> {
        val cards=LinkedList<Card>()
        Source.values().forEach {
            val key=helper.getKey(it,song)
            var card:Card?=dataBase.getCard(key)
            if(existenEnDB(card))
                card!!.cardInfo= EXISTE_EN_DB_TAG+card.cardInfo
            else {
                card = broker.getCardFromExternal(song, it)
                card?.let {dataBase.saveCardInfo(key, card)  }
            }
            card?.let { cards.add(it) }
        }
        return cards
    }

    private fun existenEnDB(card:Card?): Boolean {
        card?.let { return it.cardInfo!=null && it.imagePath!=null }
        return false
    }

}