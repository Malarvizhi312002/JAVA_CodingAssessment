package com.controller;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import com.model.JobApplication;
import com.model.JobListing;
import com.service.JobApplicationService;


public class JobApplicationController {
	public static void main(String args[]) throws SQLException
	{
		JobApplicationService jobApplicationService = new JobApplicationService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("********************OPS********************");
		System.out.println("ENTER 1 Get Job Application Details....");
		System.out.println("ENTER 0 TO EXIT");
		int input=sc.nextInt();
		
		if(input==0)
		{
			System.out.println("EXITING.......THANK YOU!!!!");
			break;
		}
		switch(input) {
		case 1:
		
		    System.out.println("***ALL APPLICATION DETAILS****");

		            List<JobApplication> list = jobApplicationService.getapplicationList();
		              for (JobApplication j : list) {
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
