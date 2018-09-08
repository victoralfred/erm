package com.springs.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.validation.constraints.NotNull;

import javax.validation.constraints.Size;

import org.springframework.stereotype.Component;


@Entity(name="students_user")
@Component
public class StudentsObjects {
  
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
//	@NotNull(message="Can not be null")
//	@Min(value=6, message="Must be a value greater than 1")
//	@Max(value=10, message="Must be a value lesser than 15")
	private Long id;
	
	@Column()
	@NotNull(message="Can not be null or empty")
	@Size(min=1, max =15, message="is required")
	private String firstname;
	@Column()
	private String middlename;
	@Column()
	private String lastname;
	@Column()
	private String email;
//	@Min(value=6, message="Must be a value greater than 1")
//	@Max(value=10, message="Must be a value lesser than 15")
	@Column()
//    @Pattern(regexp = "^[A-Za-z0-9]{5}", message="Not a valid number")
//	@Min(value=6, message="Must be a value greater than 1")
//	@Max(value=15, message="Must be a value lesser than 15")
  	private String numbervalue;
   
  
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the numbervalue
	 */
	public String getNumbervalue() {
		return numbervalue;
	}

	/**
	 * @param numbervalue the numbervalue to set
	 */
	public void setNumbervalue(String numbervalue) {
		this.numbervalue = numbervalue;
	}


	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the middlename
	 */
	public String getMiddlename() {
		return middlename;
	}

	/**
	 * @param middlename the middlename to set
	 */
	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	/**
	 * @return the lastname
	 */
	public String getLastname() {
		return lastname;
	}

	/**
	 * @param lastname the lastname to set
	 */
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	

}
