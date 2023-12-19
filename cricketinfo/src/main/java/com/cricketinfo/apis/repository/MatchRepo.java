package com.cricketinfo.apis.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cricketinfo.apis.entities.Matches;

public interface MatchRepo extends JpaRepository<Matches, Integer> {
 
	 public Matches findByMatchHeading(String matchHeading);
}
