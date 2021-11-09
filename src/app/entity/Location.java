package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Location {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column
	private Long locationID;
	
	@Column
	@NotNull(message = "Please recheck all the fields inputted.")
	private String locationName;
	
	@Column
	@NotNull(message = "Please recheck all the fields inputted.")
	private String address;

	
	public Long getLocationID() {
		return locationID;
	}


	public void setLocationID(Long locationID) {
		this.locationID = locationID;
	}


	public String getLocationName() {
		return locationName;
	}


	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	@Override
	public String toString() {
		return "Location [locationID=" + locationID + ", locationName=" + locationName + ", address=" + address + "]";
	}


	public Location () {}


	public Location(@NotNull(message = "Please recheck all the fields inputted.") String locationName,
			@NotNull(message = "Please recheck all the fields inputted.") String address) {
		super();
		this.locationName = locationName;
		this.address = address;
	};
	

	


	
}
