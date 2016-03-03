package com.altimetrik.assignment.oddevenprime;
import java.io.InputStream;
import java.util.Scanner;
public class Numbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.out.println("enter n value");
		Scanner keyin=Scanner(System.in);
				int n =keyin.nextInt();
	}

	private static Scanner Scanner(InputStream in) {
		// TODO Auto-generated method stub
		return null;
	}

	private int n;
	private char[] i;

	public void even() {
		System.out.println("the even numbers are");
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)

				System.out.println(i);
		}
	}

	public  void odd()
	{
		
		System.out.println("the odd numbers are");
		for(int i=0;i<=n;i++)
		{
			if(i%2!= 0){
				System.out.println(i);}
			
		}}

	public void prime() {
		System.out.println("the prime numbers are");
		int c = 0;
		
		for (int i = 1; i <= n; i++) {
			for (n = i; n >= 1; n--) {
				if (i % n == 0)
					c++;
			}

		}
		if (c == 2) {
			System.out.println(i);
		}
	}
}
