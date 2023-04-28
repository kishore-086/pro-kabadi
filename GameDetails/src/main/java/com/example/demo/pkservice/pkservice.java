package com.example.demo.pkservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
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
	public List<pkModel> sortDesc(String pname)
	{
		return prepo.findAll(Sort.by(pname).ascending());
	}
	public List<pkModel> sortDesc1(String pname)
	{
		return prepo.findAll(Sort.by(pname).descending());
	}
	public List<pkModel> paginationData(int pageno,int pagesize)
	{
		Page<pkModel> p=prepo.findAll(PageRequest.of(pageno, pagesize));
		return p.getContent();
	}
	public List<pkModel> paginationAndSorting(int pageNu,int pageSize,String pname)
	{
		Page<pkModel> p=prepo.findAll(PageRequest.of(pageNu, pageSize,Sort.by(pname).ascending()));
		return p.getContent();
		
	}
}
	
