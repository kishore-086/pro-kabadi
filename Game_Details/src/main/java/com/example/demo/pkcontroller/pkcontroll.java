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
import com.example.demo.pkrepository.pkrepo;
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
	public String deleteByRequestPara(@RequestParam int playerId)
	{
		pserve.deleteInfo(playerId);
		return "Player ID " +playerId+" is deleted";
	}
	@GetMapping("/sortDesc/{playername}")
	public List<pkModel> sortPlayer(@PathVariable("playername") String pname)
	{
		return pserve.sortDesc(pname);
	}
	@GetMapping("/sortDesc1/{playername}")
	public List<pkModel> sortPlayer1(@PathVariable("playername") String pname)
	{
		return pserve.sortDesc1(pname);
	}
	@GetMapping("/pagination/{pid}/{height}")
	public List<pkModel> paginationData(@PathVariable("pid")int playerId, @PathVariable("height")int height)
	{
		return pserve.paginationData(playerId,height);
	}
	
	@GetMapping("/pag/{nu}/{siz}/{name}")
	public List<pkModel> pagina(@PathVariable("nu") int nu,@PathVariable("siz") int siz,@PathVariable("name") String name)
	{
		return pserve.paginationAndSorting(nu, siz, name);
	}
	
	
}
