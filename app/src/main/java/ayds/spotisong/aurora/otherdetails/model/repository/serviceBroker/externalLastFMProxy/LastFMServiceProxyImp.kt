package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLastFMProxy

import ayds.ak2.lastfm.ExternalServiceModule
import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.business.Artist
import ayds.spotisong.aurora.otherdetails.model.repository.Source
import ayds.spotisong.aurora.song.model.Song
import java.lang.Exception

private const val NO_RESULT = "No se encontraron resultados"

internal class LastFMServiceProxyImp : LastFMServiceProxy {
    override fun getArtistInfo(song: Song): Card? {
        try {
            val externalService=ExternalServiceModule.getExternalService()
            val artistFromService=externalService.getArtistInfo(song.artistName)
            return Artist(artistFromService.artistBio, artistFromService.artistImagePath, Source.LastFM.ordinal)
        } catch (e: Exception) {
            return Artist(NO_RESULT, null, Source.LastFM.ordinal)
        }
    }
}