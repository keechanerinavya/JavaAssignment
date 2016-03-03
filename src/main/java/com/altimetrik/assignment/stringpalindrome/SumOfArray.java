package com.altimetrik.assignment.stringpalindrome;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
int A[]={3,2,4,5,6,4,5,7,3,2,3,4,7,1,2,0,0,0};
        
        int O = A.length - 3;
        
        int B = A[0] + A[1] + A[2] + A[3] + A[4] + A[5] + A[6] + A[7] + A[8] + A[9] + A[10] + A[11] + A[12] + A[13] + A[14];
        A[15] = B;  

        int C = B / O;
        A[16] = C;  
        
        int D = 0;
        
            if (A[0] < A[1]) 
            {
            	D = A[0];
            }
            else
            { 
            	D = A[1]; 
            }

            if (A[1] < A[2])
            {
            	D = A[1];
            }
            else 
            {
            	D = A[2]; 
            }
                
        
        System.out.println("The addtion of elements in an array " + B);
        System.out.println("The average of those numbers is " + C);
        System.out.println("The smallest value in the array is " + D);
    }
    



	}

