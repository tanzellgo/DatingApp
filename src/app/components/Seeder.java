package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Activity;
import app.entity.ContactInformation;
import app.entity.Interest;
import app.entity.Location;
import app.entity.PersonalInformation;
import app.repository.ActivityRepository;
import app.repository.ContactInformationRepository;
import app.repository.InterestRepository;
import app.repository.LocationRepository;
import app.repository.PersonalInformationRepository;

@Component
public class Seeder 
{
	@Autowired
	private ActivityRepository activityRepo;
	
	@Autowired
	private PersonalInformationRepository personalInformationRepo;
	
	@Autowired
	private LocationRepository locationRepo;
	
	@Autowired
	private InterestRepository interestRepo;
	
	@Autowired
	private ContactInformationRepository contactInformationRepo;
	
	@PostConstruct
	public void initialize()
	{
		
		Long u1 = 1L;
		Long u2 = 2L;
		Long u3 = 1L;
				
		
		if (personalInformationRepo.count()==0)
		{
			personalInformationRepo.save(new PersonalInformation ("John Doe", 30, "He/Him", "M"));
			personalInformationRepo.save(new PersonalInformation ("Jane Doe", 25, "She/Her", "F"));
		}
		
		if (locationRepo.count()==0)
		{
			locationRepo.save(new Location ("UP Town Center", "Katipunan Avenue"));
			locationRepo.save(new Location ("Ateneo de Manila University", "Katipunan Avenue"));
		}
		
		PersonalInformation user1 = personalInformationRepo.findByPersonalInfoID(u1);
		PersonalInformation user2 = personalInformationRepo.findByPersonalInfoID(u2);
		Location loc1 = locationRepo.findByLocationID(u3);
		
		if (interestRepo.count()==0)
		{
			interestRepo.save(new Interest ("20-25", "F", "Action", "Pop", "Pasta", "Travelling", user1));
			interestRepo.save(new Interest ("25-30", "M", "Action", "Country", "Pizza", "Fitness", user2));
		}
		
		if (contactInformationRepo.count()==0)
		{
			contactInformationRepo.save(new ContactInformation ("09171110000", "johndoe@mail.com", "facebook link - john doe", "image link - john doe", user1));
			contactInformationRepo.save(new ContactInformation ("09171112222", "janedoe@mail.com", "facebook link - jane doe", "image link - jane doe", user2));
		}
		
		if (activityRepo.count()==0)
		{
			activityRepo.save(new Activity ("Movie Date with John", "11/13/2021", "5:00PM", false, user1, user2, loc1));
		}
	}
}
