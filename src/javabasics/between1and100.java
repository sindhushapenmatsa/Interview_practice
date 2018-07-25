package javabasics;

import java.util.Scanner;

public class between1and100 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		 int a = sc.nextInt();
		 
		 /*int i = 5;
		 
		 while (i <= a)
		 {
			 System.out.println(i);
			 i=i+5; */
		 
		 
		 int i =1;
		 while (i <= a)
		 {
			 if(i%5 == 0)
			 System.out.println(i);
			 i=i+1;
		 }
			 
		 
		 
		 
		 }
	}


