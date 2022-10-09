package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class UserDto {

	private int id;
	
	@NotEmpty
	@Size(min = 4,message = "username Must Greater than 4 character")
	private String name;
	
	@Email(message = "email address must be valid")
	private String email;
	
	@NotEmpty
	@Size(min = 4,max = 12,message =  "username Must Greater than 4 and less than 12 character")
	private String password;
	
	@NotEmpty
	private String about;
	

	public UserDto() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}
}
