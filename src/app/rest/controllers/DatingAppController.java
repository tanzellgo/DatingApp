package app.rest.controllers;

import java.io.InputStream;
import java.util.List;

import javax.validation.Valid;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.media.multipart.FormDataContentDisposition;
import org.glassfish.jersey.media.multipart.FormDataParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import app.components.ActivityManager;
import app.components.ContactInformationManager;
import app.components.InterestManager;
import app.components.LocationManager;
import app.components.PersonalInformationManager;
import app.entity.Activity;
import app.entity.ContactInformation;
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
	
	@Autowired
	LocationManager locationManager;
	
	@Autowired
	PersonalInformationManager personalInfoManager;
	
	@Autowired
	ContactInformationManager contactInfoManager;
	
	@Autowired
	InterestManager interestManager;
	
	@Autowired
	private ActivityRepository activityRepo;
	
	@Autowired
	private InterestRepository interestRepo;
	
	@Autowired
	private PersonalInformationRepository personalInfoRepo;
	
	@POST
	@Path("/activity/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Activity createActivity(@Valid Activity activity) {
		return activityManager.saveActivity(activity);
	}
	
	@POST
	@Path("/activity/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Activity editActivity(@Valid Activity activity) {
		return activityManager.editActivity(activity);
	}
	
	@POST
	@Path("/location/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Location createLocation(@Valid Location location)
	{
		return locationManager.saveLocation(location);
	}

//profile/personalinfo CRUD
	@POST
	@Path("/profile/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public PersonalInformation createProfile(@Valid PersonalInformation personalInfo)
	{
		return personalInfoManager.savePersonalInfo(personalInfo);
	}
	
	@POST
	@Path("/profile/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public PersonalInformation editProfile(PersonalInformation personalInfo)
	{
		return personalInfoManager.savePersonalInfo(personalInfo);
	}

	@GET
	@Path("/profile/delete")
	@Produces(MediaType.TEXT_PLAIN)
	public String deleteProfile(@Valid @QueryParam("personalInfoID") Long x)
	{
		return String.valueOf(personalInfoManager.deletePersonalInfo(x));
	}
	
	@POST
	@Path("/contactinformation/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ContactInformation createContactInfo(@Valid ContactInformation contactInfo)
	{
		return contactInfoManager.saveContactInfo(contactInfo);
	}
	
	@POST
	@Path("/contactinformation/create/pic")
	@Consumes(MediaType.MULTIPART_FORM_DATA)
	public String upload(@FormDataParam("file") InputStream uploadedInputStream,
            			 @FormDataParam("file") FormDataContentDisposition fileDetails)
	{
		return contactInfoManager.saveContactInfoPic(uploadedInputStream, fileDetails.getFileName());
	}
	
	@POST
	@Path("/contactinformation/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public ContactInformation editContactInfo(@Valid ContactInformation contactInfo)
	{
		return contactInfoManager.saveContactInfo(contactInfo);
	}
	
	@POST
	@Path("/interest/create")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Interest createInterest(@Valid Interest interest)
	{
		return interestManager.saveInterest(interest);
	}
	
	@POST
	@Path("/interest/edit")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Interest editInterest(@Valid Interest interest)
	{
		return interestManager.saveInterest(interest);
	}
	
	
//	FIND MATCH (to fix)
//	need to return a list that matches all the findAllBy interest methods
	
	@GET
	@Path("/findmatch/age")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListAge(@Valid @QueryParam("agePreference") String agePreference){
		return interestRepo.findAllByAgePreference(agePreference);
	}
	
	@GET
	@Path("/findmatch/sex")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListSex(@Valid @QueryParam("sexPreference") String sexPreference){
		return interestRepo.findAllBySexPreference(sexPreference);
	}
	
	@GET
	@Path("/findmatch/movie")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListMovie(@Valid @QueryParam("movieGenre") String movieGenre){
		return interestRepo.findAllByMovieGenre(movieGenre);
	}
	
	@GET
	@Path("/findmatch/song")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListSong(@Valid @QueryParam("songGenre") String songGenre){
		return interestRepo.findAllBySongGenre(songGenre);
	}
	
	@GET
	@Path("/findmatch/food")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListFood(@Valid @QueryParam("faveFood") String faveFood){
		return interestRepo.findAllByFaveFood(faveFood);
	}
	
	@GET
	@Path("/findmatch/hobby")
	@Produces(MediaType.APPLICATION_JSON)
	public List<Interest> getListHobby(@Valid @QueryParam("faveHobby") String faveHobby){
		return interestRepo.findAllByFaveHobby(faveHobby);
	}
	
//	VIEW MATCH PROFILE
	@GET
	@Path("/viewmatch")
	@Produces(MediaType.APPLICATION_JSON)
	public PersonalInformation getList(@Valid @QueryParam("personalInformation") Long personalInfoID){
		return personalInfoRepo.findByPersonalInfoID(personalInfoID);
		// get personal information
		// then pass to search in personal info repo
	}
	
//	VIEW SENT INVITES
	@POST
	@Path("/viewsent")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Activity> getSent(@Valid PersonalInformation personalInformation){
		return activityRepo.findAllByInviterPersonalInformation(personalInformation);
	}
	
//	VIEW RECEIVED INVITES
	
	@POST
	@Path("/viewreceived")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public List<Activity> getRecieved(@Valid PersonalInformation personalInformation){
		return activityRepo.findAllByInviteePersonalInformation(personalInformation);
	}
	
	
}
