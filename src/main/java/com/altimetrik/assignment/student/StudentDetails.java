package com.altimetrik.assignment.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StudentDetails {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
			StudentDetails s = new   StudentDetails();
			Detail d = new StudentDetails();
					d.getdata();
			d.show();
	}
	public class Detail
	{
		int RollNumber;
		String Name;
		int Age;
		String Address;
		public void getdata() throws IOException
		{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println ("Enter Roll No. of Student");
			RollNumber = Integer.parseInt(br.readLine());
			System.out.println ("Enter Name of Student");
			Name = br.readLine();
			System.out.println ("Enter Age of Student");
			Age = Integer.parseInt(br.readLine());
			System.out.println ("Enter Address of Student");
			Address = br.readLine();
			
			
		}
		public void show()
		{
			System.out.println ("RollNumber = "+RollNumber);
			System.out.println ("Name = "+Name);
			System.out.println ("Age = "+Age);
			System.out.println ("Address = "+Address);
		}
	}

}
