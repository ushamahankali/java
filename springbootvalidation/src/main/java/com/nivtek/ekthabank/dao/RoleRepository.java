package com.nivtek.ekthabank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nivtek.ekthabank.entity.Role;

@Repository
public interface RoleRepository extends JpaRepository<Role, Integer> {

	public Role findByRole(String role);

}
