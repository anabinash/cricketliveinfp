package com.cricketinfo.apis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.mongo.ReactiveStreamsMongoClientDependsOnBeanFactoryPostProcessor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricketinfo.apis.entities.Matches;
import com.cricketinfo.apis.services.MatchServiceImpl;

@RestController
@RequestMapping("/matches")
public class MatchController {
     
	@Autowired
	MatchServiceImpl matchservice;
	 
	@GetMapping("/live")
	public ResponseEntity<List<Matches>> getAllLiveMatches(){
	 return new ResponseEntity(matchservice.getAllLiveMatches(),HttpStatus.OK);
	}
	
	@GetMapping("/allMatches")
	public ResponseEntity<List<Matches>> getAllMatches(){
		return new ResponseEntity(matchservice.getAllMatches(),HttpStatus.OK);
	}
}
