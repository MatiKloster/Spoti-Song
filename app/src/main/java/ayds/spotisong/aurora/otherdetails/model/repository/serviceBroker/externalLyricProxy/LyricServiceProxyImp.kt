package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLyricProxy

import ayds.ak4.ExternalServiceModule
import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.business.Lyrics
import ayds.spotisong.aurora.otherdetails.model.repository.Source
import ayds.spotisong.aurora.song.model.Song
import java.lang.Exception

private const val NO_RESULT = "No se encontraron resultados"

internal class LyricServiceProxyImp : LyricServiceProxy {
    override fun getLyrics(song: Song): Card? {
        try {
            val externalServiceModule: ExternalServiceModule? = ExternalServiceModule.getInstance()
            val lyrics = externalServiceModule!!.lyricsExternalService.getLyricsFromService(song.songName, song.artistName)
            return Lyrics(lyrics.lyrics, lyrics.imagePath, Source.Lyrics.ordinal)
        } catch (e: Exception) {
            return Lyrics(NO_RESULT, null, Source.Lyrics.ordinal)
        }
    }
}