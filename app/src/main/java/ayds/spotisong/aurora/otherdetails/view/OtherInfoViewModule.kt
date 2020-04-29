package ayds.spotisong.aurora.otherdetails.view

import android.content.Context
import ayds.spotisong.aurora.otherdetails.presenter.OtherInfoPresenterModule

object OtherInfoViewModule {
    fun setOtherInfoView(otherInfoView: OtherInfoView, applicationContext: Context) {
        val presenter = OtherInfoPresenterModule().getOtherInfoPresenter(otherInfoView, applicationContext)
        otherInfoView.setOtherInfoPresenter(presenter)
    }
}