package ayds.spotisong.aurora.otherdetails.view.viewpager;

import java.util.List;

import ayds.spotisong.aurora.otherdetails.view.CardView;

public interface ServiceInfoPagerAdapter {
    void showSearchResults(List<CardView> searchResults);
    void mostrarError(String mensajeError);

}
