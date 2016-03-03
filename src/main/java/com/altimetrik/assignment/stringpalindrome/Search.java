package com.altimetrik.assignment.stringpalindrome;

import java.util.Scanner;

public class Search {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter two numbers:");
		int a=sc.nextInt();
		int b=sc.nextInt();
	    int c = 0;
		if((a<1 && a>40)&&(b<1 && b>40))
		{
			System.out.println("Enter values in between 1 and 40");
		}
	
		int arr[]={4,5,23,21,36};
		
		for (int i=0; i<arr.length; i++){
			if (arr[i]==a || arr[i] ==b)
			{
				c=1;
			}
		}
		if(c==1)
		
			System.out.println("Bingo!!!");
			else 
			System.out.println("Not Found");	
		}
			}
			
		
		
