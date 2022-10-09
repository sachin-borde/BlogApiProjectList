package com.blog.payloads;

import java.util.Date;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class PostDto {

	private Integer postId;

	@NotEmpty
	@Size(min = 4, message = "Post title Must Greater than 4 character")
	private String title;

	@NotEmpty
	@Size(min = 4, max = 1000, message = "content Must Greater than 4 and less than 1000 character")
	private String content;

	private String imageName;

	private Date addedDate;

	private CategoryDto category;

	private UserDto user;
}
