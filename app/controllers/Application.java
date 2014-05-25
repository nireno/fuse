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
    result.put("status", "OK");
    result.put("activities", Json.toJson(activities));
    return ok(result);
  }
}
