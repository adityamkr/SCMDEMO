package com.aurionpro.operators;
import java.util.*;
public class AssignmentOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   int result;
		  Scanner sc = new Scanner(System.in);
		 System.out.println("Program to show Operations using Assignment Operator");
		 
		 System.out.println("Enter number1");
		 int number1 = sc.nextInt();
		 System.out.println("Enter number2");
		 int number2 = sc.nextInt();
		 
		  // using assignment operator =
		 
		   result = number1+number2;
		  
		  System.out.println("The result of num1 and num2 is = "+result);
		  
		  // add the value and then assign to variable
		  
		    result = number1+=number2;
		    System.out.println("The result will be after using += is "+result);
		    
		    // substract the value and then assign to variable
			
		    result = number1-=number2;
		    System.out.println("The result will be after using -= is "+result);
		    
		    
		 // multiply the value and then assign to variable
			  
		    result = number1*=number2;
		    System.out.println("The result will be after using *= is "+result);
		    
		 // Divide the value and then assign to variable
			  
		    result = number1/=number2;
		    System.out.println("The result will be after using /= is "+result);
		    
		    
		   
		  
		  
		 
	}

}
