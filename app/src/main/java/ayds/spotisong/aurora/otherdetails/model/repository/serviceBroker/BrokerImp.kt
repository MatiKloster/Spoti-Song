package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.Source
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalDiscoProxy.DiscoServiceProxy
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLastFMProxy.LastFMServiceProxy
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLyricProxy.LyricServiceProxy
import ayds.spotisong.aurora.song.model.Song

internal class BrokerImp(private val albumProxy: DiscoServiceProxy, private val lyricsProxy: LyricServiceProxy, private val lastfmProxy:LastFMServiceProxy):Broker {
        override fun getCardFromExternal(song: Song, source: Source): Card? =
                when (source) {
                    Source.Discogs -> albumProxy.getAlbum(song)
                    Source.Lyrics -> lyricsProxy.getLyrics(song)
                    Source.LastFM -> lastfmProxy.getArtistInfo(song)
                }
}