package models;
import java.util.*;
import javax.persistence.*;

import play.db.ebean.Model.*;
import play.db.ebean.Model;
import play.data.format.*;
import play.data.validation.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Entity
public class Activity extends Model {

  @Id
  public int id;

  @Formats.DateTime(pattern="yyyy/MM/dd hh:mm")
  public Date time_start;

  @Formats.DateTime(pattern="yyyy/MM/dd hh:mm")
  public Date time_end;

  @Lob
  @Constraints.Required
  public String task;

  public static Finder<Long, Activity> find = new Finder<Long, Activity>(Long.class, Activity.class);

}
