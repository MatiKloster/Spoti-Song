package ayds.spotisong.aurora.song.model

interface SearchSongModel {

    fun searchSong(query: String)

    fun lastSongFound(): Song

    fun getSongDescription(song: Song): String
}
