package com.example.demo.model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class citizen {
	@Id
	public int citizenId;
	public String citizenName;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="cId")
	public Adhar adhar1;
	public int getCitizenId() {
		return citizenId;
	}
	public void setCitizenId(int citizenId) {
		this.citizenId = citizenId;
	}
	public String getCitizenName() {
		return citizenName;
	}
	public void setCitizenName(String citizenName) {
		this.citizenName = citizenName;
	}
	public Adhar getAdhar1() {
		return adhar1;
	}
	public void setAdhar1(Adhar adhar1) {
		this.adhar1 = adhar1;
	}
	
	
	
	

}
