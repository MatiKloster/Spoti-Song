package ayds.spotisong.aurora.otherdetails.model.repository

import ayds.spotisong.aurora.song.model.Song

class KeyHelperImp:KeyHelper {
    override fun getKey(source: Source,song: Song): String =
            when(source){
                Source.Discogs->song.albumName
                Source.LastFM->song.artistName
                Source.Lyrics->song.songName
            }
}