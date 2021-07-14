/**
 * 
 */
package com.prediction.entity;


import java.util.Arrays;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rojav
 *
 */
@Entity
@Table(name = "job")

public class Job  {
	/**
	 * 
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	
	@Column(name = "job_id")
	private Long jobId;
	
	
	@Column(name = "job_title")
	private String jobTitle;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "job_location")
	private String jobLocation;
	
	@Column(name = "salary")
	private Float salary;
	
	@Column(name = "key_skills")
	private String[] keySkills;
	
	@Column(name = "required_expirence")
	private Double requiredExpirence;
	
	@Column(name = "vacancy")
	private Long vacancy;
	
	@Column(name = "company_name")
	private String companyName;

	public Job() {
		super();
	}
	
	@Override
	public String toString() {
		return "Job [jobId=" + jobId + ", jobTitle=" + jobTitle + ", jobDescription=" + jobDescription
				+ ", jobLocation=" + jobLocation + ", salary=" + salary + ", keySkills=" + Arrays.toString(keySkills)
				+ ", requiredExpirence=" + requiredExpirence + ", vacancy=" + vacancy + ", companyName=" + companyName
				+ "]";
	}


	public Long getJobId() {
		return jobId;
	}

	public void setJobId(Long jobId) {
		this.jobId = jobId;
	}


	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getJobDescription() {
		return jobDescription;
	}

	public void setJobDescription(String jobDescription) {
		this.jobDescription = jobDescription;
	}

	public String getJobLocation() {
		return jobLocation;
	}

	public void setJobLocation(String jobLocation) {
		this.jobLocation = jobLocation;
	}

	public Float getSalary() {
		return salary;
	}

	public void setSalary(Float salary) {
		this.salary = salary;
	}

	public String[] getKeySkills() {
		return keySkills;
	}

	public void setKeySkills(String[] keySkills) {
		this.keySkills = keySkills;
	}

	public Double getRequiredExpirence() {
		return requiredExpirence;
	}

	public void setRequiredExpirence(Double requiredExpirence) {
		this.requiredExpirence = requiredExpirence;
	}

	public Long getVacancy() {
		return vacancy;
	}

	public void setVacancy(Long vacancy) {
		this.vacancy = vacancy;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	
	 
}
