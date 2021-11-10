package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Activity;
import app.entity.PersonalInformation;
import app.repository.PersonalInformationRepository;

@Service
public class PersonalInformationManager {
	
	@Autowired
	PersonalInformationRepository personalInfoRepo;
	
	public PersonalInformation savePersonalInfo(PersonalInformation param)
	{
		return personalInfoRepo.save(param);
	}

	public PersonalInformation editPersonalInfo(PersonalInformation param) 
	{
		
		PersonalInformation newPersonalInformation = new PersonalInformation();
		PersonalInformation personalInfo = personalInfoRepo.save(newPersonalInformation);
		return personalInfo;
    }
	
	public boolean deletePersonalInfo(Long x)
	{
		personalInfoRepo.deleteById(x);
		return true;
	}
}
