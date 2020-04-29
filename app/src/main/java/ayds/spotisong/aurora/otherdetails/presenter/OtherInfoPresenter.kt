package ayds.spotisong.aurora.otherdetails.presenter

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.song.model.Song

interface OtherInfoPresenter {
    fun onInit(song: Song)
    fun onDataFound(cardData: List<Card>)
}