package com.bridgelabz.raisehire.service;

import java.util.List;

import com.bridgelabz.raisehire.dto.JobLocationdto;
import com.bridgelabz.raisehire.dto.JobSkilldto;
import com.bridgelabz.raisehire.model.Job;

public interface IJobService {
	public String addJobPost(Job Job) throws Exception;

	String addJobSkills(JobSkilldto jobSkilldto, String jobPostId) throws Exception;

	public String addJobLocation(JobLocationdto jobLocationdto, String jobPostId) throws Exception;

	public List<Job> displayAllJobs();

	List<JobLocationdto> getlocations();


}
