package javabasics;

import java.util.Scanner;

public class add {

	public static void main(String[] args) {
		/* int a = 10;
		int b = 20;
		int c = a+b;
		System.out.println(c);  */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter values for a and b");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a+b;
		
		System.out.println(c);
	
	}

}
