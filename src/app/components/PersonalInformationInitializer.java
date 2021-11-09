package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.PersonalInformation;
import app.repository.PersonalInformationRepository;

@Component
public class PersonalInformationInitializer 
{
	@Autowired
	private PersonalInformationRepository personalInformationRepo;
	
	@PostConstruct
	public void initialize()
	{
		if (personalInformationRepo.count()==0)
		{
			personalInformationRepo.save(new PersonalInformation ("John Doe", 30, "He/Him", "Male"));
			personalInformationRepo.save(new PersonalInformation ("Jane Doe", 25, "She/Her", "Female"));
		}
	}
}
