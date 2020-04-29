package ayds.spotisong.aurora.otherdetails.view.viewpager

import android.support.v4.app.FragmentManager

object ServiceInfoPagerAdapterModule {
    fun getServiceInfoPagerAdapter(fm: FragmentManager): ServiceInfoPagerAdapter {
        return ServiceInfoPagerAdapterImp(fm)
    }
}