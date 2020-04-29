package ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker

import ayds.spotisong.aurora.otherdetails.model.Card
import ayds.spotisong.aurora.otherdetails.model.repository.Source
import ayds.spotisong.aurora.song.model.Song

interface Broker {
        fun getCardFromExternal(song: Song, source: Source): Card?

}