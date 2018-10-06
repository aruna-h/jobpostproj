package com.bridgelabz.raisehire.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.raisehire.dto.JobSkilldto;

@Repository
public interface JobSkillRepository extends MongoRepository<JobSkilldto,String>{
	public void save(String JobSkilldto);

}
