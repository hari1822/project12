package com.comments.insta.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comments.insta.entity.SubComments;
import com.comments.insta.repository.SubCommentRepository;

@Service
public class SubCommentServiceImplementation implements SubCommentService {

	@Autowired
	public SubCommentRepository subCommentRepository;

	@Override
	public List<SubComments> select() {
		return subCommentRepository.findAll();
	}

	@Override
	public SubComments create(SubComments subComments) {
		subComments.setStatus(true);
		return subCommentRepository.save(subComments);
	}

	@Override
	public void softDelete(int id) {
		SubComments obj = subCommentRepository.findBySubCommentId(id);
		obj.setStatus(false);
		subCommentRepository.save(obj);
		deleteSubComment(obj.getId());
		
	}
	
	
	public void deleteSubComment(int sendId) {
		List<SubComments> obj1 = subCommentRepository.findBySubId(sendId);
		for(SubComments subComments : obj1) {
			subComments.setStatus(false);
			subCommentRepository.save(subComments);
			deleteSubComment(subComments.getId());
		}
		
		
	}
}
