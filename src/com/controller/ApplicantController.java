package com.controller;

import java.sql.SQLException;
import java.util.Scanner;
import com.service.ApplicantService;



public class ApplicantController {
	public static void main(String args[]) throws SQLException
	{
		ApplicantService applicantService=new ApplicantService();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
		System.out.println("********************OPS********************");
		System.out.println("ENTER 1 TO CREATE PROFILE.....");
		System.out.println("ENTER 2 APPLY FOR JOB.....");
		System.out.println("ENTER 0 TO EXIT");
		int input=sc.nextInt();
		
		if(input==0)
		{
			System.out.println("EXITING.......THANK YOU!!!!");
			break;
		}
		
		switch(input) {
		case 1:
			System.out.println("PROFILE CREATION.....");
			System.out.println("Enter Details:");
			System.out.println("Enter Id");
			int aid=sc.nextInt();
			
			System.out.println("Enter First Name: ");
			sc.nextLine();
			String fName=sc.nextLine();
			
			System.out.println("Enter Last Name: ");
			String lName=sc.nextLine();
			
			System.out.println("Enter Email: ");
			String email=sc.nextLine();
			
			System.out.println("Enter Phone Number: ");
			String phoneNumber=sc.nextLine();
			
			System.out.println("Resume...");
			String resume=sc.nextLine();
			
			applicantService.createProfile(aid,fName,lName,email,phoneNumber,resume);
			break;
			
		case 2:
			System.out.println("APPLY FOR JOB...");
	
			System.out.println("Job ID");
			int id=sc.nextInt();
			System.out.println("Enter Applicant ID...");
			int apid=sc.nextInt();
			 System.out.println("Enter your cover letter: ");
			 String coverLetter=sc.nextLine();
			 
			 applicantService.applyForJob(id,apid,coverLetter);
			 break;
			 
		default:
			System.out.println("INVALID INPUT");
			break;
			
		}
		}
		sc.close();
	}
}
