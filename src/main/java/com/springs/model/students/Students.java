package com.springs.model.students;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Component;

@Component
@Entity(name="students_user")
public class Students {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(updatable = false, nullable = false)
	private Long id;
	@Column(name="isActive",length = 32, columnDefinition = "varchar(32) default 'T'")
	@Enumerated(value = EnumType.STRING)
	private DefaultEnum isActive;
	@Column(name="username")
	private String username;
	@Column(name="passwprd")
	private String password;
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="uniqueId",updatable = false, nullable = false)
	private Long uniqueId;
	public enum DefaultEnum { 
	    T, F; 
	}
	public Students() {
	
	}
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
	 * @return the isActive
	 */
	public DefaultEnum getIsActive() {
		return isActive;
	}
	/**
	 * @param isActive the isActive to set
	 */
	public void setIsActive(DefaultEnum isActive) {
		this.isActive = isActive;
	}
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}


}
