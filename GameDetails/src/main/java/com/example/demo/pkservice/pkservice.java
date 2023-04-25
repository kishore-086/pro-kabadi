package com.example.demo.pkservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.pkmodel.pkModel;
import com.example.demo.pkrepository.pkrepo;

@Service
public class pkservice {

	@Autowired
	public pkrepo prepo;
	
	public pkModel saveinfo(pkModel pm) 
	{
		return prepo.save(pm);
	}
	public List<pkModel> getInfo()
	{
		return prepo.findAll();
	}
	public pkModel updateInfo(pkModel pu)
	{
		return prepo.saveAndFlush(pu);
	}
	public void deleteInfo(int id)
	{
		prepo.deleteById(id);
	}
}
	
