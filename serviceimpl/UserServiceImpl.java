package com.cub.cubadmin.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cub.cubadmin.entity.Role;
import com.cub.cubadmin.entity.User;
import com.cub.cubadmin.repository.RoleRepo;
import com.cub.cubadmin.repository.UserRepository;
import com.cub.cubadmin.service.UserService;
@Service
public class UserServiceImpl implements UserService {

	@Autowired
	UserRepository userRepository;
	
	@Autowired
	RoleRepo roleRepo;
	
	@Override
	public void saveUser(User user) {
		userRepository.save(user);		
	}

	@Override
	public void saveRole(Role role) {
		roleRepo.save(role);
		
	}

}
