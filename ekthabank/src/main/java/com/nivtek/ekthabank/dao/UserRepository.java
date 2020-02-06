package com.nivtek.ekthabank.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nivtek.ekthabank.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
