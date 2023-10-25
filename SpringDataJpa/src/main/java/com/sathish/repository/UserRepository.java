package com.sathish.repository;

import org.springframework.data.repository.CrudRepository;

import com.sathish.model.User;

public interface UserRepository extends CrudRepository<User, Integer> {

}
