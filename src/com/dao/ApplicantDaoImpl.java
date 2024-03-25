package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.util.DBUtil;

public class ApplicantDaoImpl {

	public void createProfile(int id, String fName, String lName, String email, String phoneNumber, String resume) throws SQLException {
		DBUtil db=new DBUtil();
		Connection conn;
		conn=DBUtil.getDBConn();
		String sql="insert into applicant values(?,?,?,?,?,?)";
		PreparedStatement pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, id);
		pstmt.setString(2,fName);
		pstmt.setString(3,lName);
		pstmt.setString(4,email);
		pstmt.setString(5,phoneNumber);
		pstmt.setString(6,resume);
		pstmt.executeUpdate();
		DBUtil.dbClose();
	}

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

}
