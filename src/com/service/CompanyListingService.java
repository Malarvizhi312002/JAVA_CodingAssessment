package com.service;

import java.sql.SQLException;
import java.util.List;

import com.dao.CompanyListingDao;
import com.dto.CompanyJobDto;


public class CompanyListingService {
	CompanyListingDao companylistingDaoImpl=new CompanyListingDao();

	public void jobApply(int cid, String jTitle, String desc, String loc, String type, double salary) throws SQLException {
		companylistingDaoImpl.jobApply(cid,jTitle,desc,loc,type,salary);
		
		
		
	}

	public List<CompanyJobDto> fetchDet(int id) throws SQLException {
		return companylistingDaoImpl.fetchDet(id);
	}

}
