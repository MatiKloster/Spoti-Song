package ayds.spotisong.aurora.otherdetails.view.viewpager

import android.os.Bundle
import android.support.v4.app.Fragment
import ayds.spotisong.aurora.otherdetails.view.CardView

object ServiceInfoFragmentModule {
    fun getServiceInfoFragment(card: CardView): Fragment {
        var fragment = ServiceInfoFragmentImp()
        var args = Bundle()

        if (card!= null) {
            args.putInt(SOURCE_KEY, card.source)
            args.putString(IMAGE_KEY, card.imagePath)
            args.putString(TEXT_KEY, card.cardInfo)
        }

        fragment.arguments = args
        return fragment
    }
}