package com.cub.cubadmin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cub.cubadmin.entity.Role;
import com.cub.cubadmin.entity.User;
import com.cub.cubadmin.serviceimpl.UserServiceImpl;

@RestController
@RequestMapping("/user")
public class UserController {
	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/saveUser")
	public ResponseEntity<Map<String, String>> saveUser(@RequestBody User user) {
		Map<String, String> responseMsg = new HashMap<>();
		userServiceImpl.saveUser(user);
		responseMsg.put("message", "User Saved Successfully");
		return ResponseEntity.ok(responseMsg);
	}
	
	

}
