package com.model;

public class CompanyListing {
	private int companyId;
	private String companyName;
	private String Location;
	
	public CompanyListing() {
		super();
	
	}

	public CompanyListing(int companyId, String companyName, String location) {
		super();
		this.companyId = companyId;
		this.companyName = companyName;
		Location = location;
	}

	public CompanyListing(String companyName, String location) {
		super();
		this.companyName = companyName;
		Location = location;
	}

	public int getCompanyId() {
		return companyId;
	}

	public void setCompanyId(int companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getLocation() {
		return Location;
	}

	public void setLocation(String location) {
		Location = location;
	}

	@Override
	public String toString() {
		return "CompanyListing [companyId=" + companyId + ", companyName=" + companyName + ", Location=" + Location
				+ "]";
	}
	
	
	
	

}
