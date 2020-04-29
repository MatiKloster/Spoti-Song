package ayds.spotisong.aurora.song.model.repository.external

import ayds.spotisong.aurora.song.model.Song

interface ExternalService {

    @Throws(Exception::class)
    fun getSong(query: String): Song
}
