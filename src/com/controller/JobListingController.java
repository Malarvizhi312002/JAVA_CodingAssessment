package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.dto.CompanyJobDto;
import com.model.JobListing;
import com.service.JobListingService;


public class JobListingController {
	public static void main(String args[]) throws SQLException
	{
		JobListingService jobListingService = new JobListingService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("********************OPS********************");
		System.out.println("ENTER 1 Apply.....");
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
			System.out.println("APPLY FOR JOB...");
			
			System.out.println("Job ID");
			int id=sc.nextInt();
			System.out.println("Enter Applicant ID...");
			int apid=sc.nextInt();
			 System.out.println("Enter your cover letter: ");
			 String coverLetter=sc.nextLine();
			 
			 jobListingService.applyForJob(id,apid,coverLetter);
			 break;
			
		case 2:
			
			System.out.println("***ALL JOB DETAILS****");

			List<JobListing> list = jobListingService.getJobListing();
			for (JobListing j : list) {
				System.out.println(j);
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
