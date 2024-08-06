package com.aurionpro.operators;

import java.util.*;

public class LogicalOperation {

	public static void main(String[] args) {

		// Program to check the user's voting age wherther he is eligible to Vote or not
		// if age is greater than equal to 18 the person is eligible to Vote
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Voting Age of the User");
		int age = sc.nextInt();
		if (age > 0 && age >= 18) {
			System.out.println("You are eligible to Vote");
		} else if (age < 0 || age == 0) {
			System.out.println("Invalid Input");
		} else {
			System.out.println("Sorry you are not eligible to Vote");
		}

		System.out.println("Lets Play 'Guess The Number'");
		System.out.println("Guess the no between 0 to 10");
		int userguess = sc.nextInt();
		int randomno = new Random().nextInt(11);

		if (userguess != randomno) {
			System.out.println("It was a wrong Guess Random no was " + randomno);
		} else {
			System.out.println("Perfect Guess !!!!");
		}

	}

}
