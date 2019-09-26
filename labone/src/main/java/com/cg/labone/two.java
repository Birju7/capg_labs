package com.cg.labone;

import java.util.Scanner;

public class two {
	public static int calculateDifference(int n) {

		int sum = 0, i, sumOfSquare = 0, squareSum = 0;
		for (i = 1; i <= n; i++) {
			sum = sum + i;
			sumOfSquare = sumOfSquare + i * i;
		}
		squareSum = sum * sum;

		return sumOfSquare - squareSum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Difference is " + calculateDifference(n));
		sc.close();
	}
}

