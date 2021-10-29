package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="interest")
public class Interest {

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	@Column
	private long interestID;
	
	@Column
	private String agePreference;
//	parang what we can do here siguro is have have user input XX-YY where XX is starting range and YY is ending range, then splice through the - to get the values.
	
	@Column
	private String sexPreference;
	
	@Column
	private String movieGenre;
	
	@Column
	private String songGenre;
	
	@Column
	private String faveFood;
	
	@Column
	private String faveHobby;
	
	@OneToOne  
	private PersonalInformation personalInformation;
	
//	JOSH TODO:
//	getters and setters
//	toString

}
