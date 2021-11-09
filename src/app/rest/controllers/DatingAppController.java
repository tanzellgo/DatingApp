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
import app.entity.Interest;
import app.entity.Location;
import app.entity.PersonalInformation;
import app.repository.ActivityRepository;
import app.repository.InterestRepository;
import app.repository.PersonalInformationRepository;


@Controller
@Path("/date")
public class DatingAppController {

	@Autowired
	ActivityManager activityManager;
	LocationManager locationManager;
	private ActivityRepository activityRepo;
	private InterestRepository interestRepo;
	private PersonalInformationRepository personalInfoRepo;
	
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
		//	ERROR MESSAGE - HAVEN'T TESTED YET --> will change the method into a string if this will be used
//		Location loc = locationManager.saveLocation(location);
//		
//		if (loc != null) {
//			return "Saved new location "; //+ loc.getId()
//		} else {
//			return "Location cannot be created.";
//		}
	}

//	FIND MATCH (to fix)
//	need to return a list that matches all the findAllBy interest methods
	
	@GET
	@Path("/findmatch/age")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListAge(@QueryParam("agePreference") String agePreference){
		return interestRepo.findAllByAgePreference(agePreference);
	}
	
	@GET
	@Path("/findmatch/sex")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListSex(@QueryParam("sexPreference") String sexPreference){
		return interestRepo.findAllBySexPreference(sexPreference);
	}
	
	@GET
	@Path("/findmatch/movie")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListMovie(@QueryParam("movieGenre") String movieGenre){
		return interestRepo.findAllByMovieGenre(movieGenre);
	}
	
	@GET
	@Path("/findmatch/song")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListSong(@QueryParam("songGenre") String songGenre){
		return interestRepo.findAllBySongGenre(songGenre);
	}
	
	@GET
	@Path("/findmatch/food")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListFood(@QueryParam("faveFood") String faveFood){
		return interestRepo.findAllByFaveFood(faveFood);
	}
	
	@GET
	@Path("/findmatch/hobby")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListHobby(@QueryParam("faveHobby") String faveHobby){
		return interestRepo.findAllByFaveHobby(faveHobby);
	}
	
//	VIEW MATCH PROFILE
	@GET
	@Path("/viewmatch")
	@Produces(MediaType.APPLICATION_JSON)
	public List<PersonalInformation> getList(@QueryParam("personalInformation") String personalInfoID){
		return personalInfoRepo.findAllByPersonalInfoID(personalInfoID);
		// get personal information
		// then pass to search in personal info repo
	}
	
//	VIEW SENT INVITES
	@GET
	@Path("/viewsent")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Activity> getSent(@QueryParam("personalInformation") PersonalInformation inviterPersonalInformation){
		return activityRepo.findAllByInviterPersonalInformation(inviterPersonalInformation);
	}
	
//	VIEW RECEIVED INVITES
	
	@GET
	@Path("/viewreceived")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Activity> getReiceved(@QueryParam("personalInformation") PersonalInformation inviteePersonalInformation){
		return activityRepo.findAllByInviteePersonalInformation(inviteePersonalInformation);
	}
	
}
