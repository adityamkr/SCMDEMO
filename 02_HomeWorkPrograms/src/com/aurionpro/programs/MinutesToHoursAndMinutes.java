package com.aurionpro.programs;

import java.util.Scanner;

public class MinutesToHoursAndMinutes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Minutes to convert into Hours and Minutes");
		int minutes = sc.nextInt();

		int hours = minutes / 60;
		int extra_minutes = minutes % 60;

		System.out.println(minutes + " minutes is equal to " + hours + " hrs and " + extra_minutes+" minutes");

	}

}
