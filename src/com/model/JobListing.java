package com.model;

import java.time.LocalDate;

public class JobListing {
	private int jobId;
	private int companyId;
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private String jobtype;

	
	public JobListing() {
		super();
	}


	public JobListing(int jobId, int companyId, String jobTitle, String jobDescription, String jobLocation,
			String jobtype) {
		super();
		this.jobId = jobId;
		this.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.jobtype = jobtype;
	}


	public JobListing(int companyId, String jobTitle, String jobDescription, String jobLocation, String jobtype) {
		super();
		this.companyId = companyId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.jobtype = jobtype;
	}


	public int getJobId() {
		return jobId;
	}


	public void setJobId(int jobId) {
		this.jobId = jobId;
	}


	public int getCompanyId() {
		return companyId;
	}


	public void setCompanyId(int companyId) {
		this.companyId = companyId;
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


	public String getJobtype() {
		return jobtype;
	}


	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}


	@Override
	public String toString() {
		return "JobListing [jobId=" + jobId + ", companyId=" + companyId + ", jobTitle=" + jobTitle
				+ ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation + ", jobtype=" + jobtype + "]";
	}

	
	
	

}
