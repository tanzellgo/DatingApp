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
    @GeneratedValue(strategy=GenerationType.AUTO)
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
}
