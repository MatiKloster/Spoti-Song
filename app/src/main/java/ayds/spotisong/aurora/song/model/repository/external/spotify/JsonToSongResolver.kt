package ayds.spotisong.aurora.song.model.repository.external.spotify

import ayds.spotisong.aurora.song.model.Song
import com.google.gson.Gson
import com.google.gson.JsonObject

internal class JsonToSongResolver : SpotifyToSongResolver {

    private val gson = Gson()

    @Throws(Exception::class)
    override fun getSongFromExternalData(serviceData: String): Song {
        try {
            val jobj = gson.fromJson(serviceData, JsonObject::class.java)
            val tracks = jobj.get("tracks").asJsonObject
            val items = tracks.get("items").asJsonArray
            val item = items.get(0).asJsonObject

            val album = item.get("album").asJsonObject
            val albumName = album.get("name").asString

            val artist = item.get("artists").asJsonArray.get(0).asJsonObject
            val artistName = artist.get("name").asString

            val externalUrl = item.get("external_urls").asJsonObject
            val url = externalUrl.get("spotify").asString

            val songName = item.get("name").asString

            return Song(songName, artistName, albumName, url)
        } catch (e: Exception) {
            throw Exception("No results")
        }

    }
}
