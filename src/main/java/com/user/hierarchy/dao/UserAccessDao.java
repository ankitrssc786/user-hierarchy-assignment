package com.user.hierarchy.dao;

import org.springframework.data.repository.CrudRepository;

import com.user.hierarchy.model.UserAccess;

public interface UserAccessDao extends CrudRepository<UserAccess, String> {

}
