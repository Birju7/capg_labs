package com.cg.labone;

import java.util.Scanner;

public class three {
	public static boolean checkNumber(int n) {
		int r = n%10;
		n = n/10;
		while(n>0)
		{
			int b= n%10;
			if(r <b)
				return false;
			r = b;
			n = n/10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); 
		System.out.println("Enter the number");
		int n = sc.nextInt();
		System.out.println(checkNumber(n));
		sc.close();
	}


}
