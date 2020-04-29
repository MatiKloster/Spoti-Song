package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalDiscoProxy

import ayds.ak3.discogs.ExternalAlbumModule
import ayds.ak3.discogs.ExternalSong
import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.business.Album
import ayds.spotisong.aurora.otherdetails.model.repository.Source
import ayds.spotisong.aurora.song.model.Song

private const val NO_RESULT = "No se encontraron resultados"

internal class DiscoServiceProxyImp : DiscoServiceProxy {
    override fun getAlbum(song: Song): Card? {
        try {
            val externalAlbumModule = ExternalAlbumModule.getInstance()
            val externalAlbumServiceget = externalAlbumModule.externalService
            val album = externalAlbumServiceget.getAlbum(ExternalSong(song.songName, song.artistName, song.albumName, song.url))
            return Album(album.text, album.path, Source.Discogs.ordinal)
        } catch (e: IndexOutOfBoundsException) {
            return Album(NO_RESULT, null, Source.Discogs.ordinal)
        }
    }
}