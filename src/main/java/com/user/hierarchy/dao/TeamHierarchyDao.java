package com.user.hierarchy.dao;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.user.hierarchy.model.TeamHierarchy;

import java.util.List;
import java.util.Set;

public interface TeamHierarchyDao extends CrudRepository<TeamHierarchy, String> {

    @Query(value = "SELECT * FROM teamhierarchy t where t.empid = ? OR t.managerid = ?", nativeQuery = true)
    List<TeamHierarchy> findByManagerId(@Param("empid") String empid, @Param("managerid") String managerid);
}
