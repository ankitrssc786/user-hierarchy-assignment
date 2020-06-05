package com.user.hierarchy.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.user.hierarchy.dto.UserDto;
import com.user.hierarchy.model.User;


@Repository
public interface UserDao extends CrudRepository<User, String> {

	User findByEmpId(String empId);

	@Query(value = "SELECT * FROM users", nativeQuery = true)
	List<UserDto> findUsers();
}
