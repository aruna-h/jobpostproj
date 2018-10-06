package com.bridgelabz.raisehire.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.raisehire.dto.JobLocationdto;

@Repository
public interface JobLocationRepository extends MongoRepository<JobLocationdto,String>{
	
	public void save(String JobLocationdto);
}
