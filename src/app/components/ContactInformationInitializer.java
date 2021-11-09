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
				
		PersonalInformation user1 = personalInformationRepo.findByPersonalInfoName("John Doe");
		PersonalInformation user2 = personalInformationRepo.findByPersonalInfoName("Jane Doe");
		
		if (contactInformationRepo.count()==0)
		{
			contactInformationRepo.save(new ContactInformation ("09171110000", "johndoe@mail.com", "facebook link - john doe", "image link - john doe", user1));
			contactInformationRepo.save(new ContactInformation ("09171112222", "janedoe@mail.com", "facebook link - jane doe", "image link - jane doe", user2));
		}
	}
}
