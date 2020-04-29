package ayds.spotisong.aurora.otherdetails.model.repository.local.room;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

import static android.arch.persistence.room.OnConflictStrategy.REPLACE;

@Dao
public interface CardDao {

  @Query("SELECT * FROM CardEntity")
  List<CardEntity> getAll();

  @Query("SELECT * FROM CardEntity WHERE `key` LIKE :artist LIMIT 1")
  CardEntity findByName(String artist);

  @Insert(onConflict = REPLACE)
  void insert(CardEntity artist);
}
