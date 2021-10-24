package app.rest.controllers;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.components.ActivityManager;
import app.entity.Activity;


@Controller
@Path("/date")
public class DatingAppController {

	@Autowired
	ActivityManager activityManager;
	
	@POST
	@Path("/activity/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Activity createActivity(Activity activity) {
		return activityManager.saveActivity(activity);
	}
	
	@POST
	@Path("/activity/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Activity editActivity(Activity activity) {
		return activityManager.editActivity(activity);
	}
	
	
	
}
