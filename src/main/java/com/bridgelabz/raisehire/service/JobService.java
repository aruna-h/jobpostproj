package com.bridgelabz.raisehire.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bridgelabz.raisehire.dto.JobLocationdto;
import com.bridgelabz.raisehire.dto.JobSkilldto;
import com.bridgelabz.raisehire.model.Job;
import com.bridgelabz.raisehire.repository.JobLocationRepository;
import com.bridgelabz.raisehire.repository.JobRepository;
import com.bridgelabz.raisehire.repository.JobSkillRepository;
import com.bridgelabz.raisehire.utility.Utility;

@Service
public class JobService implements IJobService {

	@Autowired
	JobRepository jobRepository;
	@Autowired
	JobSkillRepository jobSkillRepository;
	@Autowired
	JobLocationRepository jobLocationRepository;

	@Override
	public String addJobPost(Job job) throws Exception {
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String lastUpdatedUserId = simpleDateFormat.format(new Date());
		job.setLastUpdatedUserId(lastUpdatedUserId);
		job.setLastUpdatedStamp(lastUpdatedUserId);

		Utility.isValidateAllFieldsJob(job);
		Optional<Job> optionalJob = jobRepository.findById(job.getJob_title());

		if (optionalJob.isPresent()) {
			throw new Exception("job with title already exists");
		}
		jobRepository.save(job);
		String jobId = job.getJobPostId();

		return jobId;
	}

	@Override
	public String addJobSkills(JobSkilldto jobSkilldto, String jobPostId) throws Exception {

		List<JobSkilldto> listofskill = jobSkillRepository.findAll();

		for (JobSkilldto j : listofskill) {
			if (j.getJobSkillId().equals(listofskill)) {
				throw new Exception("job with this skill is already exists");
			}
		}
		jobSkillRepository.save(jobSkilldto);

		return jobPostId;

	}
	@Override
	public String addJobLocation(JobLocationdto jobLocationdto, String jobPostId) throws Exception {
		List<JobLocationdto> listoflocation = jobLocationRepository.findAll();

		for (JobLocationdto j : listoflocation) {
			if (j.getJobLoclId().equals(listoflocation)) {
				throw new Exception("job with this location is already exists");
			}
		}
		jobLocationRepository.save(jobLocationdto);

		return jobPostId;
	}
	@Override
	public List<Job> displayAllJobs()
	{
		List<Job> newJobList = new ArrayList<Job>();
		List<Job>listofjobs=jobRepository.findAll();
		listofjobs.stream().forEach(streamjoblist->newJobList.add(streamjoblist));
		
		jobRepository.saveAll(newJobList);
		return newJobList;
	}
	@Override
	public List<JobLocationdto> getlocations()
	{
		List<JobLocationdto>locationlist=jobLocationRepository.findAll();
		return locationlist;
	}

}
