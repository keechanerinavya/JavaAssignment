package com.altimetrik.assignment.Constructor;

public class Employee {
	int Number;
    String Name;
    Date DateOfJoining;
    Employee(int n, String na,Date Doj)
    {
    	Number=n;
    	Name=na;
    	DateOfJoining=Doj;
    }	
    void display()
    {
    	System.out.println("EmployeeNumber  EmployeeName   DateOfJoining");
    	System.out.println(+Number + " "+Name + " " +DateOfJoining);
    }
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
     Employee e1= new Employee(123,"Navya",03/05/14);
     e1.display();
	}

}
