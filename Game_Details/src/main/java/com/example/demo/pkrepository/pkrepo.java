package com.example.demo.pkrepository;

import java.util.List;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
//import org.springframework.data.repository.query.Param;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;

import com.example.demo.pkmodel.pkModel;

import jakarta.transaction.Transactional;


public interface pkrepo extends JpaRepository<pkModel, Integer> {
	@Query(value="select * from player_details",nativeQuery = true)
	public List<pkModel> getAllDataQ();

	@Query(value="select * from player_details where id=:id",nativeQuery = true)
	public List<pkModel> getbyidQ(@Param("id")int id);

	@Query(value="select * from player_details where player_id between :start and :end",nativeQuery = true)
	public List<pkModel> getbetweenQ(@Param("start")int start,@Param("end")int end);

	@Modifying
	@Transactional
	@Query(value="delete from player_details where age=?1 and score=?2",nativeQuery = true)
	Integer deletebyIdQ(@Param("pieces")String pieces,@Param("quantity")String quantity);

	@Modifying
	@Transactional
	@Query(value="update from player_details set points=:points where player_name=player_name",nativeQuery = true)
	public void update1Q(@Param("points")String quantity,@Param("player_name")String name);

	@Modifying
	@Transactional
	@Query("update pkModel C set C.playerName=:playerName where C.player_id=:id")
	public void updatejpQ(@Param("playerName")String quantity,@Param("player_id")int id);


	@Modifying
	@Transactional
	@Query("select C from pkModel C where C.playerName=:name")
	public List<pkModel>getQ(String name);

	@Modifying
	@Transactional
	@Query("delete from pkModel C where C.playerName=:name")
	Integer deleteBynameQ(@Param("name")String name);
	
}


