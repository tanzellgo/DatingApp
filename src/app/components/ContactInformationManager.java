package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.ContactInformation;
import app.repository.ContactInformationRepository;

@Service
public class ContactInformationManager {
	
	@Autowired
	ContactInformationRepository contactInfoRepo;
	
	public ContactInformation saveContactInfo(ContactInformation param)
	{
		return contactInfoRepo.save(param);
	}

	public ContactInformation editContactInfo(ContactInformation param) 
	{
		
		ContactInformation newContactInformation = new ContactInformation();
		ContactInformation contactInfo = contactInfoRepo.save(newContactInformation);
		return contactInfo;
    }

}
