package com.blog.services;

import java.util.List;

import com.blog.payloads.PostDto;

public interface PostService {

	// create
	PostDto createPost(PostDto postDto, Integer userId, Integer categoryId);

	// update
	PostDto updatePost(PostDto postDto, Integer postId);

	// delete
	void deletePost(Integer postId);

	// get All Post
	List<PostDto> getAllPost(Integer pageNumber, Integer pageSize);

	// get post by id
	PostDto getPostById(Integer postId);

	// get All post by category
	List<PostDto> getPostsByCategory(Integer categoryId);

	// get all post by user
	List<PostDto> getPostsByUser(Integer userId);

	// serach post by keyword
	List<PostDto> searchPosts(String keyword);

}
