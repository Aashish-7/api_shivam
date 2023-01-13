package com.coforge.api.dao;

import com.coforge.api.model.Team;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamRepository extends JpaRepository<Team, String> {

    boolean existsByTeamId(String id);
}