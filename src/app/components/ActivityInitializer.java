package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Activity;
import app.entity.Location;
import app.entity.PersonalInformation;
import app.repository.ActivityRepository;
import app.repository.LocationRepository;
import app.repository.PersonalInformationRepository;

@Component
public class ActivityInitializer 
{
	@Autowired
	private ActivityRepository activityRepo;
	
	@Autowired
	private PersonalInformationRepository personalInformationRepo;
	
	@Autowired
	private LocationRepository locationRepo;
	
	@PostConstruct
	public void initialize()
	{
		
		Long u1 = new Long(5);
		Long u2 = new Long(6);
		Long u3 = new Long(3);
				
		PersonalInformation user1 = personalInformationRepo.findByPersonalInfoID(u1);
		PersonalInformation user2 = personalInformationRepo.findByPersonalInfoID(u2);
		Location loc1 = locationRepo.findByLocationID(u3);
		
		if (activityRepo.count()==0)
		{
			activityRepo.save(new Activity ("Movie Date with John", "11/13/2021", "5:00PM", null, user1, user2, loc1));
		}
	}
}
