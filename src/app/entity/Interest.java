package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="interest")
public class Interest {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
	private long interestID;
	
	@NotNull(message = "Age preference is missing")
	@Column
	private String agePreference;
//	parang what we can do here is have have user input XX-YY where XX is starting range and YY is ending range, then splice through the - to get the values.
	
	@NotNull(message = "Sex preference is missing")
	@Column
	private String sexPreference;
	
	@NotNull(message = "Movie preference is missing")
	@Column
	private String movieGenre;
	
	@NotNull(message = "Song preference is missing")
	@Column
	private String songGenre;
	
	@NotNull(message = "Food preference is missing")
	@Column
	private String faveFood;
	
	@NotNull(message = "Hobby preference is missing")
	@Column
	private String faveHobby;
	
	@NotNull(message = "Personal Information is missing")
	@OneToOne  
	private PersonalInformation personalInformation;

	public long getInterestID() {
		return interestID;
	}

	public void setInterestID(long interestID) {
		this.interestID = interestID;
	}

	public String getAgePreference() {
		return agePreference;
	}

	public void setAgePreference(String agePreference) {
		this.agePreference = agePreference;
	}

	public String getSexPreference() {
		return sexPreference;
	}

	public void setSexPreference(String sexPreference) {
		this.sexPreference = sexPreference;
	}

	public String getMovieGenre() {
		return movieGenre;
	}

	public void setMovieGenre(String movieGenre) {
		this.movieGenre = movieGenre;
	}

	public String getSongGenre() {
		return songGenre;
	}

	public void setSongGenre(String songGenre) {
		this.songGenre = songGenre;
	}

	public String getFaveFood() {
		return faveFood;
	}

	public void setFaveFood(String faveFood) {
		this.faveFood = faveFood;
	}

	public String getFaveHobby() {
		return faveHobby;
	}

	public void setFaveHobby(String faveHobby) {
		this.faveHobby = faveHobby;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	@Override
	public String toString() {
		return "Interest [interestID=" + interestID + ", agePreference=" + agePreference + ", sexPreference="
				+ sexPreference + ", movieGenre=" + movieGenre + ", songGenre=" + songGenre + ", faveFood=" + faveFood
				+ ", faveHobby=" + faveHobby + ", personalInformation=" + personalInformation + "]";
	}
	
	public Interest () {};

	public Interest(String agePreference, String sexPreference, String movieGenre, String songGenre, String faveFood,
			String faveHobby, PersonalInformation personalInformation) {
		super();
		this.agePreference = agePreference;
		this.sexPreference = sexPreference;
		this.movieGenre = movieGenre;
		this.songGenre = songGenre;
		this.faveFood = faveFood;
		this.faveHobby = faveHobby;
		this.personalInformation = personalInformation;
	}
	
	
	
}
