package ayds.spotisong.aurora.song.model.repository.external.spotify

import ayds.spotisong.aurora.song.model.Song
import ayds.spotisong.aurora.song.model.repository.external.ExternalService
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory

internal class SpotifyService(private val spotifyAccountService: SpotifyAccountService, private val spotifyToSongResolver: SpotifyToSongResolver) : ExternalService {

    private val spotifyAPIRetrofit = Retrofit.Builder()
            .baseUrl("https://api.spotify.com/v1/")
            .addConverterFactory(ScalarsConverterFactory.create())
            .build()

    private val spotifyAPI = spotifyAPIRetrofit.create(SpotifyAPI::class.java)

    @Throws(Exception::class)
    override fun getSong(query: String): Song {
        val callResponse = getSongFromService(query)
        return spotifyToSongResolver.getSongFromExternalData(callResponse.body()!!)
    }

    @Throws(Exception::class)
    private fun getSongFromService(query: String): Response<String> {
        return spotifyAPI.getTrackInfo("Bearer " + spotifyAccountService.token, query)
                .execute()
    }
}
