package com.example.demo.pkservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pkmodel.loginModel;
import com.example.demo.pkrepository.loginrepository;

@Service
public class loginserve {
	@Autowired
	public loginrepository lrepo;
	 
	public String checkLogin(String uname,String pwd)
	{
		loginModel user=lrepo.findByuname(uname);
		if(user==null)
		{
			return "no user found";
		}
		else {
			if(user.getPwd().equals(pwd))
			{
				return "Login Succesful";
			}
			else
			{
				return "Login failed";
			}
		}
	}
	public loginModel adduser(loginModel game)
	{
		return lrepo.save(game);
	}
	public List<loginModel> getuser()
	{
		return lrepo.findAll();
	}

}
