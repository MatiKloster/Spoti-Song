package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLastFMProxy

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.song.model.Song

interface LastFMServiceProxy {
    fun getArtistInfo(song: Song): Card?
}