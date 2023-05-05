package com.example.demo.pkrepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.pkmodel.loginModel;

public interface loginrepository extends JpaRepository<loginModel, Integer> {
	loginModel findByuname(String uname);

}
