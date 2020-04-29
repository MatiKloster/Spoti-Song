package ayds.spotisong.aurora.otherdetails.presenter

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.OtherInfoModel
import ayds.spotisong.aurora.otherdetails.view.CardView
import ayds.spotisong.aurora.otherdetails.view.CardViewImp
import ayds.spotisong.aurora.otherdetails.view.OtherInfoView
import ayds.spotisong.aurora.song.model.Song
import java.util.*

private const val NO_CONNECTION="No hay conexion"
private const val EXISTE_DB="[*]"
internal class OtherInfoPresenterImp : OtherInfoPresenter {
    lateinit var view: OtherInfoView
    lateinit var model: OtherInfoModel

    override fun onInit(song: Song) {
        Thread {
            try {
                song.songName=song.songName.removePrefix(EXISTE_DB)
                model.getInfoAMostrar(song)
            } catch (e: Exception) {
                view.mostrarError(NO_CONNECTION)
            }
        }.start()
    }

    override fun onDataFound(cardData: List<Card>) {
        var cards = LinkedList<CardView>()
        cardData.forEach{
            cards.add(CardViewImp(it.cardInfo, it.imagePath, it.source))
        }
        view.showSearchResults(cards)
    }
}