package com.comments.insta.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.comments.insta.entity.Comments;
import com.comments.insta.service.CommentService;

@RestController
@RequestMapping("api/comment")
public class CommentController {

	@Autowired
	public CommentService commentService;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public List<Comments> select() {
		return commentService.select();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public Comments create(@RequestBody Comments comments) {
		return commentService.create(comments);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		commentService.softDelete(id);
	}
}
