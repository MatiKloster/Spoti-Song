package ayds.spotisong.aurora.song.model.repository

import ayds.spotisong.aurora.song.model.Song

interface SongRepository {

    fun searchSong(query: String, listener: SearchSongListener, errorListener: SearchSongErrorListener)

    fun lastSongFound(): Song

    interface SearchSongListener {
        fun onSongFound(song: Song)
    }

    interface SearchSongErrorListener {
        fun onError(e: Exception)
    }
}
