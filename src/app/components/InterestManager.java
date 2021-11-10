package app.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import app.entity.Interest;
import app.repository.InterestRepository;

@Service
public class InterestManager {
	
	@Autowired
	InterestRepository interestRepo;
	
	public Interest saveInterest(Interest param)
	{
		return interestRepo.save(param);
	}

	public Interest editInterest(Interest param) 
	{
		
		Interest newInterest = new Interest();
		Interest interest = interestRepo.save(newInterest);
		return interest;
    }

}
