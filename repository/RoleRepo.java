package com.cub.cubadmin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cub.cubadmin.entity.Role;
@Repository
public interface RoleRepo extends JpaRepository<Role, Long> {

}
