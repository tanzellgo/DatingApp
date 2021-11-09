package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Interest;
import app.entity.PersonalInformation;
import app.repository.InterestRepository;
import app.repository.PersonalInformationRepository;

@Component
public class InterestInitializer 
{
	@Autowired
	private InterestRepository interestRepo;
	
	@Autowired
	private PersonalInformationRepository personalInformationRepo;
	
	@PostConstruct
	public void initialize()
	{
		
		Long u1 = new Long(1);
		Long u2 = new Long(2);
		
				
		PersonalInformation user1 = personalInformationRepo.findByPersonalInfoID(u1);
		PersonalInformation user2 = personalInformationRepo.findByPersonalInfoID(u2);
		
		if (interestRepo.count()==0)
		{
			interestRepo.save(new Interest ("20-25", "F", "Action", "Pop", "Pasta", "Travelling", user1));
			interestRepo.save(new Interest ("25-30", "M", "Action", "Country", "Pizza", "Fitness", user2));
		}
	}
}
