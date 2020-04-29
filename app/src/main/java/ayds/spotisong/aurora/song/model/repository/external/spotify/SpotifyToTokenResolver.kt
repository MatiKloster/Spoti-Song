package ayds.spotisong.aurora.song.model.repository.external.spotify

interface SpotifyToTokenResolver {

    @Throws(Exception::class)
    fun getTokenFromExternalData(serviceData: String): String
}

