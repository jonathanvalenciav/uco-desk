package com.edu.uco.ucodesk.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "USER")
public class User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column (name = "ID_USER", nullable = false)
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Integer idUser;
	
	@Column (name = "NAME", nullable = false)
	private String name;
	
	@Column (name = "LAST_NAME", nullable = false)
	private String lastName;
	
	@Column (name = "EMAIL", nullable = false)
	private String email;
	
	@Column (name = "PASSWORD", nullable = false)
	private String password;
	
	public User() {
		super();
	}
	
	public User (Integer idUser, String name, String lastName, String email, String password) {
		super();
		this.idUser = idUser;
		this.name = name;
		this.lastName = lastName;
		this.email = email;
		this.password = password;
	}
	
	public Integer getId() {
		return idUser;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmail() {
		return this.email;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

}
