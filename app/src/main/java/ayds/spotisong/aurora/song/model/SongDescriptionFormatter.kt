package ayds.spotisong.aurora.song.model

interface SongDescriptionFormatter {

    fun getSongDescription(song: Song): String
}
