package com.bridgelabz.raisehire.model;

import java.util.List;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;

@Document(collection="job")
public class Job {
	@Id
	@ApiModelProperty(hidden = true)
	private String jobPostId;
	@NotNull
	private String job_role;
	@NotNull
	private String job_title;
	private String job_type;
	private String exp_req;
	private String job_description;
	private String sal_max;
	private String sal_min;
	private List<String>listOfLocationsIds;
	private List<String>listOfJobSkillsIds;
	private String lastUpdatedUserId;
	private String lastUpdatedStamp;
	public Job()
	{
		
	}
	public Job(String jobPostId, String job_role, String job_title, String job_type, String exp_req,
			String job_description, String sal_max, String sal_min, List<String> listOfLocationsIds,
			List<String> listOfJobSkillsIds, String lastUpdatedUserId, String lastUpdatedStamp) {
		super();
		this.jobPostId = jobPostId;
		this.job_role = job_role;
		this.job_title = job_title;
		this.job_type = job_type;
		this.exp_req = exp_req;
		this.job_description = job_description;
		this.sal_max = sal_max;
		this.sal_min = sal_min;
		this.listOfLocationsIds = listOfLocationsIds;
		this.listOfJobSkillsIds = listOfJobSkillsIds;
		this.lastUpdatedUserId = lastUpdatedUserId;
		this.lastUpdatedUserId = lastUpdatedStamp;
	}
	public String getJobPostId() {
		return jobPostId;
	}
	public void setJobPostId(String jobPostId) {
		this.jobPostId = jobPostId;
	}
	public String getJob_role() {
		return job_role;
	}
	public void setJob_role(String job_role) {
		this.job_role = job_role;
	}
	public String getJob_title() {
		return job_title;
	}
	public void setJob_title(String job_title) {
		this.job_title = job_title;
	}
	public String getJob_type() {
		return job_type;
	}
	public void setJob_type(String job_type) {
		this.job_type = job_type;
	}
	public String getExp_req() {
		return exp_req;
	}
	public void setExp_req(String exp_req) {
		this.exp_req = exp_req;
	}
	public String getJob_description() {
		return job_description;
	}
	public void setJob_description(String job_description) {
		this.job_description = job_description;
	}
	public String getSal_max() {
		return sal_max;
	}
	public void setSal_max(String sal_max) {
		this.sal_max = sal_max;
	}
	public String getSal_min() {
		return sal_min;
	}
	public void setSal_min(String sal_min) {
		this.sal_min = sal_min;
	}
	public List<String> getListOfLocationsIds() {
		return listOfLocationsIds;
	}
	public void setListOfLocationsIds(List<String> listOfLocationsIds) {
		this.listOfLocationsIds = listOfLocationsIds;
	}
	public List<String> getListOfJobSkillsIds() {
		return listOfJobSkillsIds;
	}
	public void setListOfJobSkillsIds(List<String> listOfJobSkillsIds) {
		this.listOfJobSkillsIds = listOfJobSkillsIds;
	}
	public String getLastUpdatedUserId() {
		return lastUpdatedUserId;
	}
	public void setLastUpdatedUserId(String lastUpdatedUserId) {
		this.lastUpdatedUserId = lastUpdatedUserId;
	}
	public String getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}
	public void setLastUpdatedStamp(String lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}
	@Override
	public String toString() {
		return "Job [jobPostId=" + jobPostId + ", job_role=" + job_role + ", job_title=" + job_title + ", job_type="
				+ job_type + ", exp_req=" + exp_req + ", job_description=" + job_description + ", sal_max=" + sal_max
				+ ", sal_min=" + sal_min + ", listOfLocationsIds=" + listOfLocationsIds + ", listOfJobSkillsIds="
				+ listOfJobSkillsIds + ", lastUpdatedUserId=" + lastUpdatedUserId + ", lastUpdatedStamp="
				+ lastUpdatedStamp + "]";
	}

}
