package ayds.spotisong.aurora.otherdetails.model.repository.local.room;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class CardEntity {
  @PrimaryKey(autoGenerate = true)
  private int id;
  private String key;
  private String data;
  private String image_url;
  private int source;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getData() {
    return data;
  }

  public void setData(String data) {
    this.data = data;
  }

  public String getImage_url() {
    return image_url;
  }

  public void setImage_url(String image_url) {
    this.image_url = image_url;
  }

  public int getSource() {
    return source;
  }

  public void setSource(int source) {
    this.source = source;
  }
}
