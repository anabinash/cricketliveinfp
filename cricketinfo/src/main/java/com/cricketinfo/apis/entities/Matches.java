package com.cricketinfo.apis.entities;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Table(name="cricket_match")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Matches {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int matchId;
	
	private String matchHeading;
	
	private String matchVenue;
	
	private String battingTeam;
	
	private String battingScoore;
	
	private String bowlTeam;
	
	private String bowlTeamScoore;
	
	private String liveText;
	
	private String matchLink;
	
	private String textComplete;
	
	@Enumerated
	private MatchStatus status;
	
	private Date date=new Date();
	
	
	public void setMatchStatus() {
		
		if(textComplete.isBlank()) {
			this.status=MatchStatus.LIVE;
		}
		else {
			this.status=MatchStatus.COMPLETED;
		}
	}
}
