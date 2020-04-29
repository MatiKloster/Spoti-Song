package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalDiscoProxy

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.song.model.Song

interface DiscoServiceProxy {
    fun getAlbum(song: Song): Card?
}