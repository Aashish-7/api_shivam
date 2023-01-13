package com.coforge.api.dao;

import com.coforge.api.model.OfficeAddress;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OfficeAddressRepository extends JpaRepository<OfficeAddress, String> {

    boolean existsByOfficeLocationId(String id);
}