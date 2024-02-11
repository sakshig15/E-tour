package com.etour.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.etour.entities.Cost_master;

import jakarta.transaction.Transactional;

@Repository
@Transactional
public interface Cost_masterRepository extends JpaRepository<Cost_master, Integer>
{

	// @Modifying
	//    @Transactional
	//    @Query("SELECT * FROM Cost_master cm WHERE cm.cost_id = :id")
	//    Optional<Cost_master> fetchCost(@Param("id") int id);

	  //  @Query(value="select * from Cost_master where packageid = :id",nativeQuery = true)
	  //  Optional<Cost_master> findByPackageId(@Param("id") int id);

}
