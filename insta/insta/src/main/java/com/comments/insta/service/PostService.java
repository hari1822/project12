package com.comments.insta.service;

import java.util.List;
import com.comments.insta.entity.Posts;

public interface PostService {

	List<Posts> select();

	Posts create(Posts posts);

	void softDelete(int id);
}
