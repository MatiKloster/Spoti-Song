package ayds.spotisong.aurora.otherdetails.model

import android.content.Context
import ayds.spotisong.aurora.otherdetails.model.repository.OtherInfoRepositoryModule
import ayds.spotisong.aurora.otherdetails.presenter.OtherInfoPresenter

object OtherInfoModelModule {
    fun getSearchSongModel(presenter: OtherInfoPresenter, applicationContext: Context): OtherInfoModel {
        return OtherInfoModelImp(OtherInfoRepositoryModule.getOtherInfoRepository(applicationContext),presenter)
    }
}