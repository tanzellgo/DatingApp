package app.rest.controllers;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.components.ActivityManager;
import app.components.LocationManager;
import app.entity.Activity;
import app.entity.Location;


@Controller
@Path("/date")
public class DatingAppController {

	@Autowired
	ActivityManager activityManager;
	LocationManager locationManager;
	
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
	
	@POST
	@Path("/location/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Location createLocation(Location location)
	{
		return locationManager.saveLocation(location);
	}

//	FIND MATCH (to fix)
//	@GET
//	@Path("/findmatch")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<xxxxx> getList(@QueryParam("interest") String type){
//		return interestrepo.findAllByType(type);
//	}
	
//	VIEW MATCH PROFILE
//	@GET
//	@Path("/viewmatch")
//	@Produces(MediaType.APPLICATION_JSON)
//	public List<xxxxx> getList(@QueryParam("interest") String type){
//		return personalinforepo.findAllByType(type);
//	
//	}
	
}
