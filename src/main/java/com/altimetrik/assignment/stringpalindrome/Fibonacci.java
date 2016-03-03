package com.altimetrik.assignment.stringpalindrome;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner sc= new Scanner(System.in);
System.out.println("Enter two numbers:");
int a=sc.nextInt();
int b=sc.nextInt();
System.out.print(a + " " + b + " ");

for(int i=1;i<=13;i++)
{
	int fib=a+b;
	a=b;
	b=fib; 
	System.out.print( b + " ");
}

	}

}
