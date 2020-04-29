package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLyricProxy

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.song.model.Song

interface LyricServiceProxy {
    fun getLyrics(song: Song): Card?
}