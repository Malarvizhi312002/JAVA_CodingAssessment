package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.dto.CompanyJobDto;

import com.util.DBUtil;

public class CompanyListingDao {

	public void jobApply(int cid, String jTitle, String desc, String loc, String type, double salary) throws SQLException {
		DBUtil db=new DBUtil();
		Connection conn;
		conn=DBUtil.getDBConn();
		String sql="insert into applicant values(?,?,?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, cid);
		pstmt.setString(2,jTitle);
		pstmt.setString(3,desc);
		pstmt.setString(4,loc);
		pstmt.setString(5,type);
		pstmt.setDouble(6,salary);
		pstmt.executeUpdate();
		DBUtil.dbClose();
		
	}

	public   List<CompanyJobDto> fetchDet(int id) throws SQLException {
		DBUtil db=new DBUtil();
		Connection conn;
		conn=DBUtil.getDBConn();
		 List<CompanyJobDto>list1=new ArrayList<>();
			String sql="select *"
					+ "from company c join job_listing j "
					+ "on c.id=j.company_id join "
					+ " where c.id=?";
			PreparedStatement pstmt=conn.prepareStatement(sql);
		
			pstmt.setInt(1,id);
			ResultSet rst=pstmt.executeQuery();
			
			if(rst.next())
			{
				
				int companyId=rst.getInt("company_id");
				int jobId=rst.getInt("id");
				String jobTitle=rst.getString("job_title");
				String jobDescription=rst.getString("job_description");
				String  jobLocation=rst.getString("job_location");
				String jobType=rst.getString("job_type");
			
				//save to obj
				CompanyJobDto j=new CompanyJobDto();
			    j.setCompanyId(companyId);
			    j.setJobId(jobId);
			    j.setJobTitle(jobTitle);
			    j.setJobDescription(jobDescription);
			    j.setJobLocation(jobLocation);   
			    j.setJobtype(jobType);
			  
				
				list1.add(j);
				
	}
			DBUtil.dbClose();
			return list1;

}
}
