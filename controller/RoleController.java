package com.cub.cubadmin.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cub.cubadmin.entity.Role;
import com.cub.cubadmin.serviceimpl.UserServiceImpl;
@RestController
@RequestMapping("/role")
public class RoleController {

	@Autowired
	UserServiceImpl userServiceImpl;

	@PostMapping("/saveRole")
	public String saveRole(@RequestBody Role role) {
		Map<String, String> responseMsg = new HashMap<>();
		userServiceImpl.saveRole(role);
		return "Role Saved Successfully";
	}
}
