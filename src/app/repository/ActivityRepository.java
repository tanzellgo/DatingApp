package app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import app.entity.Activity;

@Repository
public interface ActivityRepository extends JpaRepository<Activity, Long> {

	public Activity findActivityByActivityID(Long ActivityId);
	public List<Activity> findAllByInviterPersonalInformation(Long personalInfoID);
	public List<Activity> findAllByInviteePersonalInformation(Long personalInfoID);
	


}
