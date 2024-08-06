package com.aurionpro.programs;

import java.util.Scanner;

public class AreaOfTrapezoid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the length of Base1 in cm");
		double base1length = sc.nextDouble();

		System.out.println("Enter the length of Base2 in cm");
		double base2length = sc.nextDouble();

		System.out.println("Enter the height of Trapezoid in cm");
		double heightoftrapezoid = sc.nextDouble();

		double areaoftrapezoid = (base1length + base2length) / 2 * heightoftrapezoid;

		System.out.println("Area of Trapezoid is " + areaoftrapezoid + " cm.sq");

	}

}
