package ayds.spotisong.aurora.otherdetails.model.repository.local.room;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

@Database(entities = {CardEntity.class}, version = 1)
public abstract class CardDataBase extends RoomDatabase {
  public abstract CardDao cardDao();
}
