package ayds.spotisong.aurora.otherdetails.model.repository

import android.content.Context
import ayds.ak2.lastfm.ExternalServiceModule
import ayds.spotisong.aurora.otherdetails.model.repository.local.DataBaseModule
import ayds.spotisong.aurora.otherdetails.model.repository.serviceBroker.BrokerModule


object OtherInfoRepositoryModule {
    fun getOtherInfoRepository(applicationContext: Context): OtherInfoRepository {
        return OtherInfoRepositoryImp(DataBaseModule.getDataBase(applicationContext), BrokerModule.getBroker(), KeyHelperImp())
    }
}