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

  public String project;
  public String type; //Design, Development, Unavoidable etc.
  
  @Lob
  @Constraints.Required
  public String description;


  public static Finder<Integer, Activity> find = new Finder<Integer, Activity>(Integer.class, Activity.class);
}
