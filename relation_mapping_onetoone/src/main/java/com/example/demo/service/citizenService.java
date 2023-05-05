package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.citizen;
import com.example.demo.repository.citizenrepo;

@Service
public class citizenService {
	@Autowired
	public citizenrepo cr;
	
	public void post(citizen c)
	{
		 cr.save(c);
	}
	public List<citizen> get()
	{
		return cr.findAll();
	}
}
