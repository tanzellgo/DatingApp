package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Interest;

@Repository
public interface InterestRepository extends JpaRepository<Interest, Long> {

}
