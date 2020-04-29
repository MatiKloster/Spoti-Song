package ayds.spotisong.aurora.song.view

import ayds.spotisong.aurora.song.model.Song
import ayds.spotisong.aurora.song.presenter.SearchSongPresenter

interface SearchSongView {

    val query: String

    fun setSongDescription(description: String)

    fun enableActionButtons()

    fun disableActionButtons()

    fun setSearchSongPresenter(presenter: SearchSongPresenter)

    fun openExternalUrl(url: String)

    fun goToOtherDetails(song: Song)
}
