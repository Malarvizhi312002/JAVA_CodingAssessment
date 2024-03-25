package com.service;

import java.sql.SQLException;
import java.util.List;
import com.dao.JobListingDao;
import com.model.JobListing;

public class JobListingService {
	JobListingDao jobListingDao = new JobListingDao();

	public void applyForJob(int id, int apid, String coverLetter) throws SQLException {
		jobListingDao.applyForJob(id,apid,coverLetter);
	}

	public List<JobListing> getJobListing() throws SQLException {
		return jobListingDao.getjobListing();
	}

}
