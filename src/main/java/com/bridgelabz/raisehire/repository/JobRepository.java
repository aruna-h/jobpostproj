package com.bridgelabz.raisehire.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.bridgelabz.raisehire.model.Job;

@Repository
public interface JobRepository extends MongoRepository<Job, String> {
	
	//public void save(String job);
	public void save(Optional<Job> job);
	//public Optional<Job> findByJob_title(String string);
	
}
