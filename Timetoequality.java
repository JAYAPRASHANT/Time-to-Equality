package Timetoequality;

import java.util.Scanner;

public class Timetoequality {

	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		    int n=sc.nextInt();
	       
	        
	        int[] A = new int[n];
	        for(int i=0;i<n;i++) {
	        
	        	A[i]=sc.nextInt();
	        	
	        }
     
        
        int maxElement = A[0];
        int totalTime = 0;
        
        for (int i = 1; i < A.length; i++) {
            if (A[i] > maxElement) {
                maxElement = A[i];
            }
        }
        
        for (int i = 0; i < A.length; i++) {
            totalTime += maxElement - A[i];
        }
        
        System.out.println("Minimum time in seconds: " + totalTime);
    }


	}


