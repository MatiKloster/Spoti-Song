package ayds.spotisong.aurora.song.model.repository.external.spotify


import okhttp3.RequestBody
import retrofit2.Call
import retrofit2.http.*

internal interface SpotifyAPI {

    @POST("token")
    fun getToken(@Header("Authorization") credential: String, @Body tokenRequest: RequestBody): Call<String>

    @GET("search?type=track")
    fun getTrackInfo(@Header("Authorization") token: String, @Query("q") query: String): Call<String>

}
