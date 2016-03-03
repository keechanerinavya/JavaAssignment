package com.altimetrik.assignment.Inheri;


public class Cardetails {
	int Speed,NoOfGears; 
	void speed() 
	{ 
	Speed=300; 
	NoOfGears=5; 
	} 
	void display() 
	{ 
	System.out.println("Starting speed of a Car is:"+Speed); 
	System.out.println("no of gear in the car is:"+NoOfGears); 
	} 
	class Car{ 
		public void main(String args[]) 
		{ 
		SportsCar sp=new SportsCar(); 
		sp.speed(); 
		sp.airballontype(); 
		sp.display(); 
	} 

	class SportsCar extends Cardetails 
	{ 
	int initspeed,gearstatus; 
	public void airballontype() 
	{ 
	initspeed=120; 
	gearstatus=1; 
	} 
	void display() 
	{ 
	super.display(); 
	System.out.println("Starting speed of a SPORTS Car is:"+initspeed); 
	System.out.println("no of gear in the SPORTS car is:"+gearstatus); 
	} 
	} 
	}
}

	
	
    


