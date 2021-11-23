package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Location;
import app.repository.LocationRepository;

@Service
public class LocationManager {

	@Autowired 
	LocationRepository locationRepo;
	
	public Location saveLocation(Location param) {
		
		return locationRepo.save(param);
		
    }
	
}
