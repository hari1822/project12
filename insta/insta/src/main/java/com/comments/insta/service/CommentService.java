package com.comments.insta.service;

import java.util.List;
import com.comments.insta.entity.Comments;

public interface CommentService {
    
	List<Comments> select();
	
	Comments create(Comments comments);
	
	void softDelete(int id);
	
}
