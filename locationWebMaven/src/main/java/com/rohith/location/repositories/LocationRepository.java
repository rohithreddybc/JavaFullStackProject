package com.rohith.location.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohith.location.entities.location;

public interface LocationRepository extends JpaRepository<location, Integer> {

}
