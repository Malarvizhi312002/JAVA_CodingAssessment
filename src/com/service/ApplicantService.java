package com.service;

import java.sql.SQLException;

import com.dao.ApplicantDaoImpl;

public class ApplicantService {
	ApplicantDaoImpl applicantDaoImpl = new ApplicantDaoImpl();
	
	public void createProfile(int aid, String fName, String lName, String email, String phoneNumber, String resume) throws SQLException {
		applicantDaoImpl.createProfile(aid,fName,lName,email,
				phoneNumber,resume);
		
	}

	public void applyForJob(int id, int apid, String coverLetter) throws SQLException {
		applicantDaoImpl.applyForJob(id,apid,coverLetter);
		
	}

}
