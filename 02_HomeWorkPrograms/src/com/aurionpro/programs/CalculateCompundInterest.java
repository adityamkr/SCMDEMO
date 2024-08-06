package com.aurionpro.programs;
import java.util.Scanner;
public class CalculateCompundInterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		 System.out.println("Assuming Interest is Compounded Monthly");
		 System.out.println();
		System.out.println("Enter the Principal Amount");
		
		int principalamount = sc.nextInt();
		
		System.out.println("Enter the Rate of Interest");
		double rateofinterest = sc.nextDouble();
		
		System.out.println("Enter the times in years");
		double no_of_times = sc.nextDouble();
		
		 double amount = principalamount * Math.pow((1+rateofinterest / 12),12 * no_of_times);
		 
		 System.out.println("Calculated Compound Interest is "+amount);
		
		
	}

}
