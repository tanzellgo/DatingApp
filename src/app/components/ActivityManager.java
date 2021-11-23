package app.components;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Activity;
import app.repository.ActivityRepository;



@Service
public class ActivityManager {

	@Autowired 
	ActivityRepository activityRepo;
	
	
	public Activity saveActivity(Activity param) {
		
		Activity newActivity = new Activity();
		
		newActivity.setActivityName(param.getActivityName());
		newActivity.setDate(param.getDate());
		newActivity.setTime(param.getTime());
		newActivity.setAcceptance(param.getAcceptance());;
		newActivity.setInviterPersonalInformation(param.getInviterPersonalInformation());
		newActivity.setInviteePersonalInformation(param.getInviteePersonalInformation());
		newActivity.setLocation(param.getLocation());
	
		Activity activity = activityRepo.save(newActivity);
		
       return activity;
    }
	
	// general update for any activity
	public Activity editActivity(Activity param) {
		
		Activity oldActivity = activityRepo.findActivityByActivityID(param.getActivityID());
		
		oldActivity.setActivityName(param.getActivityName());
		oldActivity.setDate(param.getDate());
		oldActivity.setTime(param.getTime());
		oldActivity.setAcceptance(param.getAcceptance());;
		oldActivity.setInviterPersonalInformation(param.getInviterPersonalInformation());
		oldActivity.setInviteePersonalInformation(param.getInviteePersonalInformation());
		
		Activity activity = activityRepo.save(oldActivity);
		
       return activity;
    }
}
