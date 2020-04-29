package ayds.spotisong.aurora.otherdetails.model.repository.local

import android.arch.persistence.room.Room
import android.content.Context
import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.business.Artist

import ayds.spotisong.aurora.otherdetails.model.repository.local.room.CardDataBase
import ayds.spotisong.aurora.otherdetails.model.repository.local.room.CardEntity

private const val EXTRA_INFO_DB = "extra_info.db"
internal class DataBaseImp(context: Context) : DataBase {

    private val db: CardDataBase = Room.databaseBuilder(context,
            CardDataBase::class.java, EXTRA_INFO_DB).build()

    override fun saveCardInfo(cardName: String, card: Card) {
        val artistEntity = CardEntity()

        artistEntity.key = cardName
        artistEntity.data = card.cardInfo
        artistEntity.image_url = card.imagePath
        artistEntity.source = card.source

        db.cardDao().insert(artistEntity)
    }

    override fun getCard(cardName: String): Card {
        val info = getInfo(cardName)
        val url = getImageUrl(cardName)
        val source = getSource(cardName)

        return Artist(info, url, source)
    }

    override fun getInfo(cardName: String): String? {

        val artistEntity = db.cardDao().findByName(cardName)

        if (artistEntity != null)
            return artistEntity.getData()
        return null
    }

    override fun getImageUrl(cardName: String): String? {

        val artistEntity = db.cardDao().findByName(cardName)

        if (artistEntity != null)
            return artistEntity.getImage_url()
        return null
    }

    override fun getSource(cardName: String): Int {
        val artistEntity = db.cardDao().findByName(cardName)

        if (artistEntity != null)
            return artistEntity.source
        return 0
    }
}
