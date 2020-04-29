package ayds.spotisong.aurora.song.model.repository.external.spotify

import com.google.gson.Gson
import com.google.gson.JsonObject

internal class JsonToTokenResolver : SpotifyToTokenResolver {

    private val gson = Gson()

    override fun getTokenFromExternalData(serviceData: String): String {
        val tokenResp = gson.fromJson(serviceData, JsonObject::class.java)
        val accessToken = tokenResp.get("access_token")

        return accessToken.asString
    }
}
