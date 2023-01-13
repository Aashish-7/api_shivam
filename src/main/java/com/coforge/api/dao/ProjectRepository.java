package com.coforge.api.dao;

import com.coforge.api.model.Project;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<Project, String> {

    boolean existsByProjectId(String id);
}