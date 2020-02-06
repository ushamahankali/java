package com.nivtek.springboot.restapi.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.nivtek.springboot.restapi.entity.Employee;

@RepositoryRestResource
public interface EmployeeDAO extends CrudRepository<Employee, Integer> {

}
