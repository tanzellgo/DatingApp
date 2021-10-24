package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="activity")
public class Activity {
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
    private long activityID;
	
	@NotNull(message = "Activity name is missing")
	@Column
    private String activityName;
	
	@Column
    private String date;
	
	@Column
    private String time;
	
	@Column
    private Boolean acceptance;
	
	@ManyToOne (fetch = FetchType.EAGER)  
	private PersonalInformation inviterPersonalInformation;  
	
	@ManyToOne (fetch = FetchType.EAGER)  
	private PersonalInformation inviteePersonalInformation; 

	@ManyToOne (fetch = FetchType.EAGER)  
	private Location location;

	public long getActivityID() {
		return activityID;
	}

	public void setActivityID(long activityID) {
		this.activityID = activityID;
	}

	public String getActivityName() {
		return activityName;
	}

	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getTime() {
		return time;
	}

	public void setTime(String time) {
		this.time = time;
	}

	public Boolean getAcceptance() {
		return acceptance;
	}

	public void setAcceptance(Boolean acceptance) {
		this.acceptance = acceptance;
	}

	public PersonalInformation getInviterPersonalInformation() {
		return inviterPersonalInformation;
	}

	public void setInviterPersonalInformation(PersonalInformation inviterPersonalInformation) {
		this.inviterPersonalInformation = inviterPersonalInformation;
	}

	public PersonalInformation getInviteePersonalInformation() {
		return inviteePersonalInformation;
	}

	public void setInviteePersonalInformation(PersonalInformation inviteePersonalInformation) {
		this.inviteePersonalInformation = inviteePersonalInformation;
	}

	public Location getLocation() {
		return location;
	}

	public void setLocation(Location location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Activity [activityID=" + activityID + ", activityName=" + activityName + ", date=" + date + ", time="
				+ time + ", acceptance=" + acceptance + ", inviterPersonalInformation=" + inviterPersonalInformation
				+ ", inviteePersonalInformation=" + inviteePersonalInformation + ", location=" + location + "]";
	} 
	
	
}
