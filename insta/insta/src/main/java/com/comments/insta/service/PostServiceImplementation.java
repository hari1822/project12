package com.comments.insta.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comments.insta.entity.Posts;
import com.comments.insta.entity.Users;
import com.comments.insta.repository.PostRepository;

@Service
public class PostServiceImplementation implements PostService {

	@Autowired
	public PostRepository postRepository;

	@Override
	public List<Posts> select() {
		return postRepository.findAll();
	}
	
	@Override
	public Posts create(Posts posts) {
		posts.setStatus(true);
		return postRepository.save(posts);
	}
	
	@Override
    public void softDelete(int id) {
    	Posts obj = postRepository.findByPostId(id);
    	obj.setStatus(false);
    	postRepository.save(obj);
    }
}
