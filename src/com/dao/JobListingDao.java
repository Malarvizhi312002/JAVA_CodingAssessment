package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.model.JobListing;
import com.util.DBUtil;

public class JobListingDao {

	public void applyForJob(int id, int apid, String coverLetter) throws SQLException {
		DBUtil db=new DBUtil();
		Connection conn;
		conn=DBUtil.getDBConn();
		String sql="insert into job_application values(?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setInt(2, apid);
		pstmt.setString(3,coverLetter);
		DBUtil.dbClose();
		
	}

	public List<JobListing> getjobListing() throws SQLException {
		List<JobListing> list = new ArrayList<>();
		Connection conn = DBUtil.getDBConn();
		/* Step 1: Prepare the statement */
		String sql="select * from vehicle";
		PreparedStatement pstmt = conn.prepareStatement(sql);	
		/* execute the statement */
		ResultSet rst= pstmt.executeQuery();
		/* iterate over the result set and read DB column*/
		while(rst.next()) {
			int id = rst.getInt("id");
			String jobTitle = rst.getString("job_title");
			String jobDescription = rst.getString("job_description");
			int companyId=rst.getInt("company_id");
			String jobtype = rst.getString("job_type");
			String jobLocation=rst.getString("job_location");
			
			JobListing job = new JobListing ();
			 
			list.add(job);
		}
		DBUtil.dbClose();
		return list;	
		}

}
