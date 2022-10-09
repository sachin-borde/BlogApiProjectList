package com.blog.payloads;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {

	private int id;

	@NotEmpty
	@Size(min = 4, message = "username Must Greater than 4 character")
	private String name;

	@Email(message = "email address must be valid")
	private String email;

	@NotEmpty
	@Size(min = 4, max = 12, message = "username Must Greater than 4 and less than 12 character")
	private String password;

	@NotEmpty
	private String about;
}
