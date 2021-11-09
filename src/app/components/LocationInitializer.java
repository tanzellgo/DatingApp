package app.components;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.entity.Location;
import app.repository.LocationRepository;

@Component
public class LocationInitializer 
{
	@Autowired
	private LocationRepository locationRepo;
	
	@PostConstruct
	public void initialize()
	{
		if (locationRepo.count()==0)
		{
			locationRepo.save(new Location ("UP Town Center", "Katipunan Avenue"));
			locationRepo.save(new Location ("Ateneo de Manila University", "Katipunan Avenue"));
		}
	}
}
