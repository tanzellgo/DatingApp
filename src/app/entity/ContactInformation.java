package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="contact_information")
public class ContactInformation {

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column
    private long id;
	
	@NotNull(message = "Phone number is missing")
	@Column
    private String phoneNumber;
	
	@Email(message = "Email should be valid")
	@Column
    private String email;
	
	@Column
    private String facebookLink;
	
	@Column
    private String image;
	
	@OneToOne  
	private PersonalInformation personalInformation;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFacebookLink() {
		return facebookLink;
	}

	public void setFacebookLink(String facebookLink) {
		this.facebookLink = facebookLink;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public PersonalInformation getPersonalInformation() {
		return personalInformation;
	}

	public void setPersonalInformation(PersonalInformation personalInformation) {
		this.personalInformation = personalInformation;
	}

	@Override
	public String toString() {
		return "ContactInformation [id=" + id + ", phoneNumber=" + phoneNumber + ", email=" + email + ", facebookLink="
				+ facebookLink + ", image=" + image + ", personalInformation=" + personalInformation + "]";
	}
	
	public ContactInformation () {};

	public ContactInformation(@NotNull(message = "Phone number is missing") String phoneNumber,
			@Email(message = "Email should be valid") String email, String facebookLink, String image,
			PersonalInformation personalInformation) {
		super();
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.facebookLink = facebookLink;
		this.image = image;
		this.personalInformation = personalInformation;
	}

	
	
}
