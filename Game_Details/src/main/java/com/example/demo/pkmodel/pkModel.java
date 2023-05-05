package com.example.demo.pkmodel;

import jakarta.persistence.Entity;
//import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="playerDetails")
public class pkModel {
	@Id
//	@GeneratedValue
	public int playerId;
	public String playerName;
	public String playerCountry;
	public String playerTeam;
	public int points;
	public int average;
	public int age;
	public int height;
	public String Position;
	
	public int getPoints() {
		return points;
	}
	public void setPoints(int points) {
		this.points = points;
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerCountry() {
		return playerCountry;
	}
	public void setPlayerCountry(String playerCountry) {
		this.playerCountry = playerCountry;
	}
	public String getPlayerTeam() {
		return playerTeam;
	}
	public void setPlayerTeam(String playerTeam) {
		this.playerTeam = playerTeam;
	}
	
}
