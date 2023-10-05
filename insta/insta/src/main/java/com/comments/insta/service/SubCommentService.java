package com.comments.insta.service;

import java.util.List;
import com.comments.insta.entity.SubComments;

public interface SubCommentService {

	List<SubComments> select();

	SubComments create(SubComments subComments);

	void softDelete(int id);
	
}
