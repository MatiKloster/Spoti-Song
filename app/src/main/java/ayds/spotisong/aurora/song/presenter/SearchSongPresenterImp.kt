package ayds.spotisong.aurora.song.presenter

import ayds.spotisong.aurora.song.model.SearchSongModel
import ayds.spotisong.aurora.song.model.Song
import ayds.spotisong.aurora.song.view.SearchSongView

internal class SearchSongPresenterImp : SearchSongPresenter {

    private var view: SearchSongView? = null
    private var model: SearchSongModel? = null

    fun setView(view: SearchSongView) {
        this.view = view
    }

    fun setModel(model: SearchSongModel) {
        this.model = model
    }

    override fun onSongSearch() {
        view!!.disableActionButtons()
        view!!.setSongDescription("Loading...")
        model!!.searchSong(view!!.query)
    }

    override fun onError(e: Exception) {
        view!!.disableActionButtons()
        view!!.setSongDescription("Error: " + e.message)
    }

    override fun onOpenUrl() {
        view!!.openExternalUrl(model!!.lastSongFound().url)
    }

    override fun onOtherInfo() {
        view!!.goToOtherDetails(model!!.lastSongFound())
    }

    override fun onSongFound(song: Song) {
        view!!.enableActionButtons()
        view!!.setSongDescription(model!!.getSongDescription(song))
    }

    override fun onDestroy() {
        view = null
    }
}
