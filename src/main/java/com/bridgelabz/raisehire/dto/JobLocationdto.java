package com.bridgelabz.raisehire.dto;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

@Document(collection="jobLocation")
public class JobLocationdto {
	private String jobPostId;
	@Id
	@ApiModelProperty(hidden=true)
	private String jobLoclId;
	private String locationName;
	private String lastUpdatedStamp;
	
	public JobLocationdto()
	{
		
	}

	public JobLocationdto(String jobPostId, String jobLoclId, String locationName, String lastUpdatedStamp) {
		super();
		this.jobPostId = jobPostId;
		this.jobLoclId = jobLoclId;
		this.locationName = locationName;
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public String getJobPostId() {
		return jobPostId;
	}

	public void setJobPostId(String jobPostId) {
		this.jobPostId = jobPostId;
	}

	public String getJobLoclId() {
		return jobLoclId;
	}

	public void setJobLoclId(String jobLoclId) {
		this.jobLoclId = jobLoclId;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(String lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	@Override
	public String toString() {
		return "JobLocationdto [jobPostId=" + jobPostId + ", jobLoclId=" + jobLoclId + ", locationName=" + locationName
				+ ", lastUpdatedStamp=" + lastUpdatedStamp + "]";
	}
}
