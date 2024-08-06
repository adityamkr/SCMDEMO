package com.aurionpro.operators;
import java.util.*;
public class ComparisonOperators {

	 public static void main(String[] args) {
		 System.out.println("Program to check larget among 2 no's");
		  
		  Scanner sc= new Scanner(System.in);
		  int number1 = sc.nextInt();
		  System.out.println("Enter number 2");
		  int number2 = sc.nextInt();
		  
		    if(number1  > number2)
		    {
		    	System.out.println("Number 1 is greater");
		    }
		    else if(number1 == number2)
		    {
		    	System.out.println("Number 2 is greater");
		    }
		    else if(number1 < number2)
		    {
		    	System.out.println("Number 3 is greater");
		    }
		    
		    System.out.println(number1 !=number2);
		   
	}
	 
	  
}
