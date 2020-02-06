package com.nivtek.ekthabank.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nivtek.ekthabank.entity.CreditCard;

public interface CreditCardRepository extends JpaRepository<CreditCard, Integer> {

	CreditCard findBycardNumber(long cardNumber);

}
