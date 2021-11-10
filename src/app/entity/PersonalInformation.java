package app.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class PersonalInformation {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column
	private Long personalInfoID;
	
	@Column
	@NotNull(message = "Name is missing")
	private String personalInfoName;
	
	@Column
	@NotNull(message = "Age is missing")
	private Integer age;
	
	@Column
	@NotNull(message = "Pronouns are missing")
	private String pronouns;
	
	@Column
	@NotNull(message = "Sex is missing")
	private String sex;

	public Long getPersonalInfoID() {
		return personalInfoID;
	}

	public void setPersonalInfoID(Long personalInfoID) {
		this.personalInfoID = personalInfoID;
	}

	public String getPersonalInfoName() {
		return personalInfoName;
	}

	public void setPersonalInfoName(String personalInfoName) {
		this.personalInfoName = personalInfoName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getPronouns() {
		return pronouns;
	}

	public void setPronouns(String pronouns) {
		this.pronouns = pronouns;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "PersonalInformation [personalInfoID=" + personalInfoID + ", personalInfoName=" + personalInfoName
				+ ", age=" + age + ", pronouns=" + pronouns + ", sex=" + sex + "]";
	}

	public PersonalInformation () {};
	
	public PersonalInformation(@NotNull(message = "Name is missing") String personalInfoName,
			@NotNull(message = "Age is missing") Integer age,
			@NotNull(message = "Pronouns are missing") String pronouns,
			@NotNull(message = "Sex is missing") String sex) {
		super();
		this.personalInfoName = personalInfoName;
		this.age = age;
		this.pronouns = pronouns;
		this.sex = sex;
	}

	
	
}
