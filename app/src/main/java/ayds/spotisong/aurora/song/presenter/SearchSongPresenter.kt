package ayds.spotisong.aurora.song.presenter

import ayds.spotisong.aurora.song.model.Song

interface SearchSongPresenter {

    fun onSongSearch()

    fun onOpenUrl()

    fun onOtherInfo()

    fun onSongFound(song: Song)

    fun onError(e: Exception)

    fun onDestroy()
}
