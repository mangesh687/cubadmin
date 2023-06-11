package com.cub.cubadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cub.cubadmin.entity.User;
@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	
}
