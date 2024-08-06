package com.aurionpro.programs;

import java.util.Scanner;

public class BmiCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
			
		   System.out.println("Enter Weight in Kg");
			int weight = sc.nextInt();
			
		   System.out.println("Enter Height in meteres");
		    double height = sc.nextDouble();
		   
		   double BMI = (weight/Math.pow(height,2));
		   
		   System.out.println("Your BMI is "+BMI);
		  
	}

}
