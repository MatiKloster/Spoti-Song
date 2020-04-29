package ayds.spotisong.aurora.otherdetails.view.viewpager

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import android.support.v4.view.PagerAdapter
import ayds.spotisong.aurora.otherdetails.view.CardView
import ayds.spotisong.aurora.otherdetails.view.CardViewImp

private const val  NUM_ITEMS = 3
internal class ServiceInfoPagerAdapterImp(fm: FragmentManager) : FragmentStatePagerAdapter(fm), ServiceInfoPagerAdapter {

    private var lastFMCard: CardView
    private var discoGSCard: CardView
    private var lyricsDBCard: CardView

    init {
        lastFMCard = CardViewImp(null, null, 0)
        discoGSCard = CardViewImp(null, null, 0)
        lyricsDBCard = CardViewImp(null, null, 0)
    }

    override fun getItem(position: Int): Fragment? {
        when (position) {
            0 -> return ServiceInfoFragmentModule.getServiceInfoFragment(lastFMCard)
            1 -> return ServiceInfoFragmentModule.getServiceInfoFragment(lyricsDBCard)
            2 -> return ServiceInfoFragmentModule.getServiceInfoFragment(discoGSCard)
            else -> return null
        }
    }

    override fun getCount(): Int {
        return NUM_ITEMS
    }

    override fun getItemPosition(`object`: Any): Int {
        return PagerAdapter.POSITION_NONE
    }

    override fun showSearchResults(searchResults: List<CardView>) {
        for (card in searchResults) {
            if (card.source == 0)
                lastFMCard = card
            else if (card.source == 1)
                lyricsDBCard = card
            else
                discoGSCard = card
        }
    }

    override fun mostrarError(mensajeError: String) {
        lastFMCard.cardInfo = mensajeError
        discoGSCard.cardInfo = mensajeError
        lyricsDBCard.cardInfo = mensajeError
    }
}
