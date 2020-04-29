package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker

import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalDiscoProxy.DiscoServiceProxyImp
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLastFMProxy.LastFMServiceProxyImp
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.externalLyricProxy.LyricServiceProxyImp

object BrokerModule {
    fun getBroker():Broker{
        return BrokerImp(albumProxy = DiscoServiceProxyImp(),
                lyricsProxy = LyricServiceProxyImp(),
                lastfmProxy = LastFMServiceProxyImp()
        )
    }
}