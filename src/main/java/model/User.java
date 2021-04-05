package model;

import java.sql.Date;

import javax.persistence.Access;
import javax.persistence.AccessType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="usr")
@Access(value=AccessType.FIELD)
public class User {
	@Column(name="email")
	@Id
	private String email;
	@Column(name="passwd")
	private String password;
	@Column(name="firstname")
	private String name;
	@Column(name="lastname")
	private String lastname;
	@Column(name="country")
	private String country;
	@Column(name="birthdate")
	private Date birthDate;

	public User() {
	}

	public User(String email, String password, String name, String lastname, String country, Date birthDate) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.lastname = lastname;
		this.country = country;
		this.birthDate = birthDate;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

}