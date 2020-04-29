package ayds.spotisong.aurora.song.model.repository.local

import ayds.spotisong.aurora.song.model.Song

interface LocalDB {

    fun saveSong(song: Song)

    fun getSong(name: String): Song
}
