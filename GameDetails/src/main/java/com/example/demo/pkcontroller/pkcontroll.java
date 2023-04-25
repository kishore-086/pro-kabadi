package com.example.demo.pkcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.pkmodel.pkModel;
import com.example.demo.pkservice.pkservice;

@RestController
public class pkcontroll {
	
	@Autowired
	public pkservice pserve;
	
	@PostMapping("/savepk")
	public pkModel addDetails(@RequestBody pkModel pa)
	{
		return pserve.saveinfo(pa);
	}
	
	@GetMapping("/getpk")
	public List<pkModel> getDetails()
	{
		return pserve.getInfo();
	}
	@PutMapping("/updatepk")
	public pkModel updateDetails(@RequestBody pkModel id)
	{
		return pserve.updateInfo(id);
	}
	@DeleteMapping("/deletepk/{pid}")
	public String deleteDetails(@PathVariable("pid")int playerId)
	{
		pserve.deleteInfo(playerId);
		return "Player Id "+playerId+" Deleted";
	}
	@DeleteMapping("/deleteBYReq")
	public String deleteByRequestPara(@RequestParam("pid")int playerId)
	{
		pserve.deleteInfo(playerId);
		return "Player ID " +playerId+" is deleted";
	}
}
