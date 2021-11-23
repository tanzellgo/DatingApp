package app.components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.ContactInformation;
import app.repository.ContactInformationRepository;

@Service
public class ContactInformationManager {
	
	String UPLOAD_PATH = "temp/";
	
	@Autowired
	ContactInformationRepository contactInfoRepo;
	
	public ContactInformation saveContactInfo(ContactInformation param)
	{
		return contactInfoRepo.save(param);
	}
	
	public String saveContactInfoPic(InputStream uploadedInputStream, String filename)
	{
        try {
        	File dir = new File(UPLOAD_PATH);
        	dir.mkdirs();
        	
            int read = 0;
            byte[] bytes = new byte[1024];
     
            File file = new File(dir, filename);
            
    		OutputStream out = new FileOutputStream(file);
            while ((read = uploadedInputStream.read(bytes)) != -1)
            {
                out.write(bytes, 0, read);
            }
            out.flush();
			out.close();
			
			return "OK - save to image";
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			return "BAD";
		}
	}
	

	public ContactInformation editContactInfo(ContactInformation param) 
	{
		
		ContactInformation newContactInformation = new ContactInformation();
		ContactInformation contactInfo = contactInfoRepo.save(newContactInformation);
		return contactInfo;
    }

}
