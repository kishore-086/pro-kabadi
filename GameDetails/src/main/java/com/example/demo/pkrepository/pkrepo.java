package com.example.demo.pkrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pkmodel.pkModel;

public interface pkrepo extends JpaRepository<pkModel, Integer> {

}
