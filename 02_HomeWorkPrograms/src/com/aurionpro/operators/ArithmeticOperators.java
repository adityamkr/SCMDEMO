package com.aurionpro.operators;

import java.util.*;
public class ArithmeticOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
		
		 System.out.println("Program to  perform All Arithmetic Operation Based on UserInput");
		 
		   System.out.println("Enter number 1");
		  int number1 = sc.nextInt();
		  System.out.println("Enter number 2");
		  int number2 = sc.nextInt();
		  
		  int addition = number1+number2;
		  int substraction = number1-number2;
		  int multiplication = number1*number2;
		  int division = number1 / number2;
		  
		  System.out.println("The Addition of "+number1+" and "+number2+" is "+addition);
		  System.out.println("The Substraction of "+number1+" and "+number2+" is "+substraction);
		  System.out.println("The Multiplication of "+number1+" and "+number2+" is "+multiplication);
		  System.out.println("The Division of "+number1+" and "+number2+" is "+division);
		 

	}

}
