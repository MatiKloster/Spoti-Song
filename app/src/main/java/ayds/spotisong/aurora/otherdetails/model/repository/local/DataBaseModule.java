package ayds.spotisong.aurora.otherdetails.model.repository.local;

import android.content.Context;

public class DataBaseModule {
    private static DataBase db;

    public static DataBase getDataBase(Context context) {
        if (db == null)
            db = new DataBaseImp(context);

        return db;
    }
}
