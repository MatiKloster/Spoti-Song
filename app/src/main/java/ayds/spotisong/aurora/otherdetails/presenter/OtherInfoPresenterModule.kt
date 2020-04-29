package ayds.spotisong.aurora.otherdetails.presenter

import android.content.Context
import ayds.spotisong.aurora.otherdetails.model.OtherInfoModelModule
import ayds.spotisong.aurora.otherdetails.view.OtherInfoView

class OtherInfoPresenterModule {
    fun getOtherInfoPresenter(view: OtherInfoView, applicationContext: Context): OtherInfoPresenter {
        val presenter = OtherInfoPresenterImp()
        val model = OtherInfoModelModule.getSearchSongModel(presenter, applicationContext)
        presenter.view=view
        presenter.model=model
        return presenter
    }
}