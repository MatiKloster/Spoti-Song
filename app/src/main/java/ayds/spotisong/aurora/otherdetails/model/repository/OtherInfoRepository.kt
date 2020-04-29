package ayds.spotisong.aurora.otherdetails.model.repository

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.song.model.Song

interface OtherInfoRepository {
    fun getCards(song: Song): List<Card>
}