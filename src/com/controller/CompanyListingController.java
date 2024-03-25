package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.CompanyJobDto;

import com.service.CompanyListingService;

public class CompanyListingController {
	public static void main(String args[]) throws SQLException
	{
		CompanyListingService companyListingService=new CompanyListingService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("********************OPS********************");
		System.out.println("ENTER 1 Post for jobs.....");
		System.out.println("ENTER 2 GET JOB DETAILS.....");
		System.out.println("ENTER 0 TO EXIT");
		int input=sc.nextInt();
		
		if(input==0)
		{
			System.out.println("EXITING.......THANK YOU!!!!");
			break;
		}
		
		switch(input) {
		case 1:
			System.out.println("JOB DETAILS.....");
			System.out.println("Enter Details:");
			System.out.println("Enter Company Id");
			int cid=sc.nextInt();
			
			System.out.println("Enter Job Title: ");
			sc.nextLine();
			String jTitle=sc.nextLine();
			
			System.out.println("Enter Job Description: ");
			String desc=sc.nextLine();
			
			System.out.println("Enter Job Location : ");
			String loc=sc.nextLine();
			
			System.out.println("Enter Job type ");
			String type=sc.nextLine();
			
			System.out.println("Salary...");
			double salary=sc.nextDouble();
			
			companyListingService.jobApply(cid,jTitle,desc,loc,type,salary);
			
		case 2:
			
			 System.out.println("GET JOB DETAILS");
				System.out.println("Enter company id to fetch details: ");
				int id=sc.nextInt();
				List<CompanyJobDto>list1=companyListingService.fetchDet(id);
				for(CompanyJobDto j:list1)
				{
					System.out.println("[companyId="+j.getCompanyId()+  ", jobId=" + j.getJobId() + ", jobDescription=" + j.getJobDescription()+ 
							 ", jobLocation=" + j.getJobLocation() + ", jobType=" + j.getJobtype()+"]");
				}
				break;
		default:
			System.out.println("INVALID INPUT");
			break;
			 
			
		}
		}
		sc.close();
	}

	

}
