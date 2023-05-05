package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.citizen;

public interface citizenrepo extends JpaRepository<citizen, Integer> {

}
