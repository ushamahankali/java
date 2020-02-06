package com.nivtek.ekthabank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivtek.ekthabank.entity.SecurityQuestion;

public interface SecurityQuestionRepository extends JpaRepository<SecurityQuestion, Integer> {

}
