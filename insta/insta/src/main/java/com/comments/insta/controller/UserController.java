package com.comments.insta.controller;

import java.util.List;

import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.comments.insta.entity.Users;
import com.comments.insta.service.UserService;

@RestController
@RequestMapping("api/user")
public class UserController {

	@Autowired
	public UserService userService;
	
	@RequestMapping(value = "/select", method = RequestMethod.GET)
	public List<Users> select() {
		return userService.select();
	}
	
    @RequestMapping(value = "/create", method = RequestMethod.POST)
	public Users create(@RequestBody Users users) {
		return userService.create(users);
	}
    
    @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
    public Users update(@PathVariable int id, @RequestBody Users users) {
    	return userService.update(id, users);
    }
    
    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void delete(int id) {
    	userService.softDelete(id);
    }
}
