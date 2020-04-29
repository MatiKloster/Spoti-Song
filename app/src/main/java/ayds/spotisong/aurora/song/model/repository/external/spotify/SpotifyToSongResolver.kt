package ayds.spotisong.aurora.song.model.repository.external.spotify

import ayds.spotisong.aurora.song.model.Song

interface SpotifyToSongResolver {

    @Throws(Exception::class)
    fun getSongFromExternalData(serviceData: String): Song
}

