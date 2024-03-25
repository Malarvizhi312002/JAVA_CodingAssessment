package com.model;

public class Applicant {
	private int applicantId;
	private String fName;
	private String lName;
	private String email;
	private String phoneNumber;
	private String resume;
	
	public Applicant() {
		super();
		
	}

	public Applicant(int applicantId, String fName, String lName, String email, String phoneNumber, String resume) {
		super();
		this.applicantId = applicantId;
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.resume = resume;
	}

	public Applicant(String fName, String lName, String email, String phoneNumber, String resume) {
		super();
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.resume = resume;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getResume() {
		return resume;
	}

	public void setResume(String resume) {
		this.resume = resume;
	}

	@Override
	public String toString() {
		return "Applicant [applicantId=" + applicantId + ", fName=" + fName + ", lName=" + lName + ", email=" + email
				+ ", phoneNumber=" + phoneNumber + ", resume=" + resume + "]";
	}
	
	
	

}
