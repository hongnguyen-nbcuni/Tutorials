package com.example.java.utilities;

import java.util.Scanner;

public class MathHelper {

	public static String getInput(String prompt) {
		System.out.print(prompt);
		Scanner sc = new Scanner(System.in);
		return sc.nextLine();
	}

	public static double addValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 + d2;
	}

	public static double subtractValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 - d2;
	}

	public static double multiplyValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 * d2;
	}

	public static double divideValues(String s1, String s2) {
		double d1 = Double.parseDouble(s1);
		double d2 = Double.parseDouble(s2);
		return d1 / d2;
	}

}

