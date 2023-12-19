package com.cricketinfo.apis.services;

import java.util.List;
import java.util.Map;

import com.cricketinfo.apis.entities.Matches;

public interface MatchService {

	
	// get all matches
	List<Matches> getAllMatches();
	//get all live matches
	List<Matches> getAllLiveMatches();
	//get point table
	List<Map<String ,String>> getPointTable();
	
	public  void updateMatchInDb(Matches match);
	
	
}
