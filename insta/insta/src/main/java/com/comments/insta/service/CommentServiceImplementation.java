package com.comments.insta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.comments.insta.entity.Comments;
import com.comments.insta.repository.CommentRepository;

@Service
public class CommentServiceImplementation implements CommentService {

	@Autowired
	public CommentRepository commentRepository;

	@Override
	public List<Comments> select() {
		return commentRepository.findAll();
	}

	@Override
	public Comments create(Comments comments) {
		comments.setStatus(true);
		return commentRepository.save(comments);
	}

	@Override
	public void softDelete(int id) {
		Comments obj = commentRepository.findByCommentId(id);
		obj.setStatus(false);
		commentRepository.save(obj);
	}
}
