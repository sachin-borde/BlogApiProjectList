package com.blog.payloads;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {

	private Integer categoryId;
	
	@NotEmpty
	@Size(min = 4, message = "category title Must Greater than 4 character")
	private String categoryTitle;
	
	@NotEmpty
	@Size(min = 4, max = 1000, message = "description Must Greater than 4 and less than 1000 character")
	private String categoryDescription;

}
