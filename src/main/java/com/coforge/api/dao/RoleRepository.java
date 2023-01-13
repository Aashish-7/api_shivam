package com.coforge.api.dao;

import com.coforge.api.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role, String> {

    boolean existsByRoleId(String id);
}