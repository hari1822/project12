package com.comments.insta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comments.insta.entity.Posts;
import com.comments.insta.service.PostService;

@RestController
@RequestMapping("api/post")
public class PostController {

	@Autowired
	public PostService postService;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public List<Posts> select() {
		return postService.select();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Posts create(@RequestBody Posts posts) {
		return postService.create(posts);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		postService.softDelete(id);
	}
}
