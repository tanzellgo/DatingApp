package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Interest;
import app.entity.PersonalInformation;

@Repository
public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long> {

	public List<PersonalInformation> findAllByID(String personalInfoID);
}
