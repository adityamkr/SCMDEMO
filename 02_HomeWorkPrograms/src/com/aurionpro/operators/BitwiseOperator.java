package com.aurionpro.operators;

import java.util.Scanner;

public class BitwiseOperator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// performing bitwise & 
		System.out.println("Enter Num1");
		int num1 = sc.nextInt();
		
		System.out.println("Enter Num2");
		int num2 = sc.nextInt();
		
		  int result = num1 & num2;
		  
		  System.out.println("Bitwise & becomes "+result);
		  
		  // bitwise |
		  
		  int res = num1 | num2;
		  System.out.println("Bitwise | becomes "+res);
		  
		  // left shift
		  
		    int leftshift  = num1 << num2;
		    System.out.println("Leftshift = "+leftshift);
		    
		    int rightshift  = num1 >> num2;
		    System.out.println("Rightshift = "+rightshift);

	}

}
