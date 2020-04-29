package ayds.spotisong.aurora.song.model

internal class SongDescriptionFormatterImp : SongDescriptionFormatter {

    override fun getSongDescription(song: Song): String {
        return "Song: " + song.songName + ".\n" +
                "Artist: " + song.artistName + ".\n" +
                "Album: " + song.albumName + ".\n"
    }
}
