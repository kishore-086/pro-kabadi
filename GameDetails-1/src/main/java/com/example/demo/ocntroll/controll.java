package com.example.demo.ocntroll;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.repository.repo;

import ch.qos.logback.core.model.Model;

@RestController
public class controll {
	@Autowired
	public repo r;
	@GetMapping
	public List<Model> set()
	{
		return r.getAllvalue();
	}

}
