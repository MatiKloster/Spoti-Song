package ayds.spotisong.aurora.otherdetails.model.repository.business

import ayds.spotisong.aurora.otherdetails.model.Card

internal class Album(override var cardInfo: String?, override val imagePath: String?, override val source: Int) : Card {
}