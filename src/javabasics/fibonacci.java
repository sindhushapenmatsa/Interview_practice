package javabasics;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		 int a = sc.nextInt();
		 int a1=0;
		 int a2=1;
		 int a3;
		 
		 System.out.println(a1 + a2);
		 
		 for(int i=2;i<=a;i++)
		 {
			 a3=a1+a2;
			 System.out.println(a3);
			 a1=a2;
			 a2=a3;
		 }
		 

	}

}
