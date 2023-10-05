package com.comments.insta.service;

import java.util.List;
import org.apache.catalina.User;
import com.comments.insta.entity.Users;

public interface UserService {

	List<Users> select();

	Users create(Users users);

	Users update(int id, Users users);

	void softDelete(int id);
}
