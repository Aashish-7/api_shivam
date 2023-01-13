package com.coforge.api.dao;

import com.coforge.api.model.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, String> {

    boolean existsByDepartmentId(String departmentId);
}