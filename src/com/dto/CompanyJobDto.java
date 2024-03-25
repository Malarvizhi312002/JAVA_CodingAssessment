package com.dto;


public class CompanyJobDto {
	private int companyId;
	private int jobId;
	private String jobTitle;
	private String jobDescription;
	private String jobLocation;
	private String jobtype;
	
	
	

	public CompanyJobDto(int companyId, int jobId, String jobTitle, String jobDescription, String jobLocation,
			 String jobtype ) {
		super();
		this.companyId = companyId;
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.jobtype = jobtype;
		
	}
	
	public CompanyJobDto() {
		// TODO Auto-generated constructor stub
		this.companyId = companyId;
		this.jobId = jobId;
		this.jobTitle = jobTitle;
		this.jobDescription = jobDescription;
		this.jobLocation = jobLocation;
		this.jobtype = jobtype;
	}

	public int getCompanyId() {
		return companyId;
	}
	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}
	public int getJobId() {
		return jobId;
	}
	public void setJobId(int jobId) {
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
	public String getJobtype() {
		return jobtype;
	}


	public void setJobtype(String jobtype) {
		this.jobtype = jobtype;
	}
	@Override
	public String toString() {
		return "CompanyJobDto [companyId=" + companyId + ", jobId=" + jobId + ", jobTitle=" + jobTitle
				+ ", jobDescription=" + jobDescription + ", jobLocation=" + jobLocation + ", jobtype=" + jobtype + "]";
	}
}
	