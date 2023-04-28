package com.example.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.qos.logback.core.model.Model;

public interface repo extends JpaRepository<Model, Integer> {
	@Query("select c from model c")
	public List<Model> getAllvalue();

}
