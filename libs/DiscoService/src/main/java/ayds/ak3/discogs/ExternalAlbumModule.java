package ayds.ak3.discogs;

import ayds.ak3.discogs.GSAPI.GSAPIModule;

public class ExternalAlbumModule {
    private static ExternalAlbumModule instance;

    private ExternalAlbumModule() {}

    public static ExternalAlbumModule getInstance() {
        if (instance == null) {
            instance = new ExternalAlbumModule();
        }
        return instance;
    }

    public ExternalAlbumService getExternalService() {
        return GSAPIModule.getInstance().getExternalService();
    }
}