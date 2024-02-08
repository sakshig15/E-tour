package com.etour.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.etour.entities.Iternary;
import jakarta.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public interface IternaryRepository extends JpaRepository<Iternary,Integer>
{
	@Modifying
	@Query
	List<Iternary> findByPackage_id(int package_id);

}
