package com.techprimers.jpa.springjpahibernateexample.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.techprimers.jpa.springjpahibernateexample.model.Users;

public interface UsersRepository extends JpaRepository<Users, Integer> {

	// Optional<List<Users>> findByName(String name);
	List<Users> findByName(String name);

}
