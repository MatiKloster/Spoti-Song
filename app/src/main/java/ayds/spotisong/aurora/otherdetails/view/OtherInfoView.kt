package ayds.spotisong.aurora.otherdetails.view

import ayds.spotisong.aurora.otherdetails.presenter.OtherInfoPresenter
import ayds.spotisong.aurora.otherdetails.view.formatter.TextToHtmlFormatter
import ayds.spotisong.aurora.otherdetails.view.viewpager.ServiceInfoPagerAdapter

interface OtherInfoView {
    fun setOtherInfoPresenter(presenter: OtherInfoPresenter)
    fun showSearchResults(searchResults: List<CardView>)
    fun mostrarError(cadenaDeError: String)
}