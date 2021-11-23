package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.ContactInformation;

@Repository
public interface ContactInformationRepository extends JpaRepository<ContactInformation, Long> {

}
