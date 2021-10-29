package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Interest;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Long> {

	public List<Interest> findAllByAgePreference(String agePreference);
	public List<Interest> findAllBySexPreference(String sexPreference);
	public List<Interest> findAllByMovieGenre(String movieGenre);
	public List<Interest> findAllBySongGenre(String songGenre);
	public List<Interest> findAllByFaveFood(String faveFood);
	public List<Interest> findAllByFaveHobby(String faveHobby);
	
}
