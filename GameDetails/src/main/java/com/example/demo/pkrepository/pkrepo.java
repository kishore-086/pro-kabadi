package com.example.demo.pkrepository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.example.demo.pkmodel.pkModel;

@Repository
public interface pkrepo extends JpaRepository<pkModel, Integer> {
	@Query(value="select * from pkModel",nativeQuery=true)
	public List<pkModel> getAllvalue();
	
	@Query("select c from pkModel c where playerId=:id")
	public List<pkModel> getbyname(@Param("id") int id);
	
	@Query("delete from pkModel c where c.playerId=:id")
	Integer delete(@Param("id") int id);
	
//	@Query("update pkModel c set c.playerId=:id ")
//	Integer delete(@Param("id") int id);
}


