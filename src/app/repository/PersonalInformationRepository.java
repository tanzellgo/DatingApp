package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.PersonalInformation;

@Repository
public interface PersonalInformationRepository extends JpaRepository<PersonalInformation, Long> {

}
