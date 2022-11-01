package com.bridgelab.day1.fundamentals;

import java.util.Scanner;

public class StringEquality {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter First String");
		String FirstString = sc.nextLine();
		System.out.println("Enter Second String");
		String SecondString = sc.nextLine();
		if (FirstString.equals(SecondString)) {
			System.out.println("Strings are equal");
		} else {
			System.out.println("Strings are not equal");
		}
	}
}
