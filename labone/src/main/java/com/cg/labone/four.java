package com.cg.labone;

import java.util.Scanner;

public class four {
	
	public static boolean checkNumber(int num) 
    { 
        if (num == 0) 
            return false; 
          
        while (num != 1) 
        { 
            if (num % 2 != 0) 
                return false; 
            num = num / 2; 
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
