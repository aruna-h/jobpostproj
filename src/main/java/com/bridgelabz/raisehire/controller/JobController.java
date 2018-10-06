package com.bridgelabz.raisehire.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabz.raisehire.dto.JobLocationdto;
import com.bridgelabz.raisehire.dto.JobSkilldto;
import com.bridgelabz.raisehire.dto.ResponseDTO;
import com.bridgelabz.raisehire.model.Job;
import com.bridgelabz.raisehire.service.IJobService;
import com.bridgelabz.raisehire.utility.ExceptionHandler;

@RestController
@RequestMapping("/job")
public class JobController {
	@Autowired 
	IJobService jobService;
	
	ResponseDTO response=new ResponseDTO();
	
	public static final Logger logger = LoggerFactory.getLogger(JobController.class);
	String REQ_ID="INSIDE";
	String RES_ID="OUTSIDE";
	
	@RequestMapping(value = "/AddJobPost", method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO>jobPost(@RequestBody Job job) throws Exception
	{
		logger.info(REQ_ID);
		jobService.addJobPost(job);
		response.setMessage("job added successfully");
		response.setStatus(200);
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/AddJobSkills", method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO>jobSkills(@RequestBody JobSkilldto jobSkilldto,@RequestParam String jobPostId) throws Exception
	{
		logger.info(REQ_ID);
		jobService.addJobSkills(jobSkilldto,jobPostId);
		response.setMessage("job skills added successfully");
		response.setStatus(200);
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/AddJobLocation", method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO>jobLocation(@RequestBody JobLocationdto jobLocationdto,@RequestParam String jobPostId) throws Exception
	{
		logger.info(REQ_ID);
		jobService.addJobLocation(jobLocationdto,jobPostId);
		response.setMessage("job locations added successfully");
		response.setStatus(200);
		return new ResponseEntity(response,HttpStatus.OK);
	}
	
	@RequestMapping(value = "/DisplayAllJobs", method = RequestMethod.POST)
	public ResponseEntity<ResponseDTO>displyJob() throws Exception
	{
		logger.info(REQ_ID);
		List<Job>list=null;
		list=jobService.displayAllJobs();
		response.setMessage("successfully displaying jobs ");
		response.setStatus(200);
		return new ResponseEntity(list,HttpStatus.OK);
	}
	@GetMapping("/getjoblocations")
	public ResponseEntity<ResponseDTO>getAlllocations()
	{
		List<JobLocationdto>list=null;
		list=jobService.getlocations();
		response.setMessage("successfully got job locations ");
		response.setStatus(200);
		return new ResponseEntity(list,HttpStatus.OK);
		
	}

}
