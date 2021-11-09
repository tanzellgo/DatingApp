package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.ContactInformation;
import app.entity.PersonalInformation;
import app.repository.ContactInformationRepository;
import app.repository.PersonalInformationRepository;

@Component
public class ContactInformationInitializer 
{
	@Autowired
	private ContactInformationRepository contactInformationRepo;
	
	@Autowired
	private PersonalInformationRepository personalInformationRepo;
	
	@PostConstruct
	public void initialize()
	{
		
		Long u1 = new Long(1);
		Long u2 = new Long(2);
		
				
		PersonalInformation user1 = personalInformationRepo.findByPersonalInfoID(u1);
		PersonalInformation user2 = personalInformationRepo.findByPersonalInfoID(u2);
		
		if (contactInformationRepo.count()==0)
		{
			contactInformationRepo.save(new ContactInformation ("09171110000", "johndoe@mail.com", "facebook link - john doe", "image link - john doe", user1));
			contactInformationRepo.save(new ContactInformation ("09171112222", "janedoe@mail.com", "facebook link - jane doe", "image link - jane doe", user2));
		}
	}
}
