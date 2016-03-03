package com.altimetrik.assignment.Constructor;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	}
	class Employee
	{
		int Number;
		String Name;
		Date DateOfJoining;
    public  Employee(int Num,String empname,int i)	
    {
    	Number=Num;
    	Name=empname;
    	DateOfJoining=i;
    	
    	
    	
   }
    private void Display() {
    	System.out.println("Employee details are"+ Number + " " + Name + " " + DateOfJoining);
		
	}
	Employee e1 = new Employee(123,"Rahul",2/4/15);
    e1.Display();
	}
}
