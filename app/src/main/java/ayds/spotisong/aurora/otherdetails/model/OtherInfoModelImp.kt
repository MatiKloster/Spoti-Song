package ayds.spotisong.aurora.otherdetails.model

import ayds.spotisong.aurora.otherdetails.model.repository.OtherInfoRepository
import ayds.spotisong.aurora.otherdetails.presenter.OtherInfoPresenter
import ayds.spotisong.aurora.song.model.Song

internal class OtherInfoModelImp(private val repository: OtherInfoRepository, private val presenter: OtherInfoPresenter) : OtherInfoModel{

    override fun getInfoAMostrar(song: Song) {
        val artistDataToShow = repository.getCards(song)
        presenter.onDataFound(artistDataToShow)
    }
}