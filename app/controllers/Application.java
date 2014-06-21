package controllers;

import views.html.*;
import models.*;

import java.util.*;

import play.*;
import play.mvc.*;
import play.libs.Json;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }

  @BodyParser.Of(BodyParser.Json.class)
  public static Result activity() {
    ObjectNode result = Json.newObject();
    List<Activity> activities = Activity.find.all();
    result.put("activities", Json.toJson(activities));
    return ok(result);
  }

  @BodyParser.Of(BodyParser.Json.class)
  public static Result createActivity() {
    JsonNode json = request().body().asJson();
    Activity activity = Json.fromJson(json, Activity.class);
    activity.save();
    ObjectNode result = Json.newObject();
    result.put("action", "New activity added.");
    return ok(result);
  }

  public static Result updateActivity(int id) {
    JsonNode json = request().body().asJson();
    Activity activity = Json.fromJson(json, Activity.class);
    activity.update(id);
    ObjectNode result = Json.newObject();
    result.put("action", "Activity updated.");
    return ok(result);
  }

  public static Result deleteActivity(int id) {
    Activity.find.byId(id).delete();
    ObjectNode result = Json.newObject();
    result.put("action", "Activity deleted.");
    return ok(result);
  }
}
