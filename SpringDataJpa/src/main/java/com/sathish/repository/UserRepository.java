package com.sathish.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sathish.model.User;

//@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
//	@Modifying
//	@Query("UPDATE User  u  SET u.username = :#{user.username} ,u.email=:#{user.email},u.password=:#{user.password} WHERE u.id =:#{user.id})")
//	void updateUserDB(@Param("user") User user);
}
