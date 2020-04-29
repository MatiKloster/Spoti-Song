package ayds.spotisong.aurora.otherdetails.model.repository

import ayds.spotisong.aurora.song.model.Song

interface KeyHelper {
    fun getKey(source:Source,song: Song):String
}