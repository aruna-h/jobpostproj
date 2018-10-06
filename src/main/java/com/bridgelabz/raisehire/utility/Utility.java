package com.bridgelabz.raisehire.utility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.stereotype.Component;

import com.bridgelabz.raisehire.model.Job;

@Component
public class Utility {
	public static void isValidateAllFieldsJob(Job job) throws Exception 
	{
		if (!validateJob_role(job.getJob_role())) {
			throw new Exception("job role must be String not any digits");
		}
		else if(!validateexp_req(job.getExp_req()))
		{
			throw new Exception("experience required should be in number of years and should be less than 5 years");
		}
		
	}

	private static boolean validateexp_req(String exp_req) {
		Pattern exp_reqPattern=Pattern.compile("^[0-5]$");
		Matcher matcher=exp_reqPattern.matcher(exp_req);
		return matcher.matches();
	}

	private static boolean validateJob_role(String job_role) {
		Pattern job_rolePattern = Pattern.compile("^[a-zA-Z]{3,20}$");
		Matcher matcher = job_rolePattern.matcher(job_role);
		return matcher.matches();
		
	}
	
}
