package com.bridgelabz.raisehire.dto;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import io.swagger.annotations.ApiModelProperty;
@Document(collection="jobSkill")
public class JobSkilldto implements Serializable{
	private String jobPostId;
	@Id
	@ApiModelProperty(hidden=true)
	private String jobSkillId;

	private String skillName;

	private String lastUpdatedStamp;

	public JobSkilldto() {

	}

	public JobSkilldto(String jobSkillId, String skillName, String lastUpdatedStamp) {
		super();
		this.jobSkillId = jobSkillId;
		this.skillName = skillName;
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	public String getJobSkillId() {
		return jobSkillId;
	}

	public void setJobSkillId(String jobSkillId) {
		this.jobSkillId = jobSkillId;
	}

	public String getSkillName() {
		return skillName;
	}

	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	public String getLastUpdatedStamp() {
		return lastUpdatedStamp;
	}

	public void setLastUpdatedStamp(String lastUpdatedStamp) {
		this.lastUpdatedStamp = lastUpdatedStamp;
	}

	@Override
	public String toString() {
		return "JobSkilldto [jobPostId=" + jobPostId + ", jobSkillId=" + jobSkillId + ", skillName=" + skillName
				+ ", lastUpdatedStamp=" + lastUpdatedStamp + "]";
	}

}
