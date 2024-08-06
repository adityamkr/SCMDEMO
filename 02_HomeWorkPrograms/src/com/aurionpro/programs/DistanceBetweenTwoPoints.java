package com.aurionpro.programs;

import java.util.*;

public class DistanceBetweenTwoPoints {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter 1st point");
		System.out.println("Enter x1");
		double x1 = sc.nextDouble();
		System.out.println("Enter y1");
		double y1 = sc.nextDouble();

		System.out.println("Enter 2nd Point");
		System.out.println("Enter x2");
		double x2 = sc.nextDouble();
		System.out.println("Enter y2");
		double y2 = sc.nextDouble();

		double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

		System.out.println(
				"Distance between two points (" + x1 + ", " + y1 + ")  (" + x2 + ", " + y2 + ") is " + distance);

	}

}
