package com.comments.insta.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.comments.insta.entity.Users;
import com.comments.insta.repository.UserRepository;

@Service
public class UserServiceImplementation implements UserService {

	@Autowired
	public UserRepository userRepository;

	@Override
	public List<Users> select() {
		return userRepository.findAll();
	}

	@Override
	public Users create(Users users) {
		users.setStatus(true);
		return userRepository.save(users);
	}

	@Override
	public Users update(int id, Users users) {
		Users obj = userRepository.findByUserId(id);
		obj.setName(users.getName());
		return userRepository.save(obj);
	}
	
	@Override
	public void softDelete(int id) {
		Users obj1 = userRepository.findByUserId(id);
		obj1.setStatus(false);
		userRepository.save(obj1);
	}
}
