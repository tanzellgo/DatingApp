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
	private Long LocationID;
	
	@Column
	@NotNull(message = "Please recheck all the fields inputted.")
	private String LocationName;
	
	@Column
	@NotNull(message = "Please recheck all the fields inputted.")
	private String Address;

	@Override
	public String toString() {
		return "Location [LocationID=" + LocationID + ", LocationName=" + LocationName + ", Address=" + Address + "]";
	}

	public Long getLocationID() {
		return LocationID;
	}

	public void setLocationID(Long locationID) {
		LocationID = locationID;
	}

	public String getLocationName() {
		return LocationName;
	}

	public void setLocationName(String locationName) {
		LocationName = locationName;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public Location () {};
	
	public Location(@NotNull(message = "Please recheck all the fields inputted.") String locationName,
			@NotNull(message = "Please recheck all the fields inputted.") String address) {
		super();
		LocationName = locationName;
		Address = address;
	}


	
}
