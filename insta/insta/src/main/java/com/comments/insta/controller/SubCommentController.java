package com.comments.insta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comments.insta.entity.SubComments;
import com.comments.insta.service.SubCommentService;

@RestController
@RequestMapping("api/subComment")
public class SubCommentController {

	@Autowired
	public SubCommentService subCommentService;

	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public List<SubComments> select() {
		return subCommentService.select();
	}

	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public SubComments create(@RequestBody SubComments subComments) {
		return subCommentService.create(subComments);
	}

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public void delete(@PathVariable int id) {
		subCommentService.softDelete(id);
	}
}
