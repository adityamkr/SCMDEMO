package com.aurionpro.operators;

import java.util.Scanner;

public class CheckVowelOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Scanner sc = new Scanner(System.in);
		 System.out.println("Input Character to check it is vowel or Consonant");
		  char c = sc.nextLine().charAt(0);
		  
		
		   switch(c)
		   {
		   case 'a':
		   case 'e':
		   case 'i':
		   case 'o':
		   case 'u': System.out.println("Character is Vowel");
   					break;
   		   default:
   			      System.out.println("Character is not Vowel");
		   }
		  
	}

}
