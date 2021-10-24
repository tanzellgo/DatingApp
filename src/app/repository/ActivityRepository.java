package app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

}
