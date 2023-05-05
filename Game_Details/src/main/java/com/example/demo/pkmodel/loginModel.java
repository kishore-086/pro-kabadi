package com.example.demo.pkmodel;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity

public class loginModel {
   @Id
   @GeneratedValue(strategy = GenerationType.AUTO)
   public int id;
   public String uname;
   public String pwd;
   
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getUname() {
	return uname;
}
public void setUname(String uname) {
	this.uname = uname;
}
public String getPwd() {
	return pwd;
}
public void setPwd(String pwd) {
	this.pwd = pwd;
}
   
}
