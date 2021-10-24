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
		
//		Indicated setters
	
		Activity activity = activityRepo.save(newActivity);
		
       return activity;
    }
	
	public Activity editActivity(Activity param) {
		
		Activity newActivity = new Activity();
		
//		Indicated setters
	
		Activity activity = activityRepo.save(newActivity);
		
       return activity;
    }
}
