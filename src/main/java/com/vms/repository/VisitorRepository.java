package com.vms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vms.entity.Visitor;

@Repository
public interface VisitorRepository extends JpaRepository<Visitor, Integer> {
	
	// here i will create the methods that will help to fetch/retrieve data that are not provided by STS.
	
	
	

}
