package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Adhar;

public interface adharrepo extends JpaRepository<Adhar, Integer> {

}
