package com.coforge.api.dao;

import com.coforge.api.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employee, Long> {

    Employee findByEmployeeId(Long id);
}