package javabasics;

import java.util.Scanner;

public class greatestnumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the numbers");
		 int a = sc.nextInt();
		 int b = sc.nextInt();
		 int c = sc.nextInt();
		 
		 if((a>b) && (a>c))
			 System.out.println("A is greater");
		 else if ((b>a) && (b>c))
		     System.out.println("B is greater");
		 else if ((c>a) && (c>b))
				 System.out.println("C is greater");
		 else
			 System.out.println("All are equal");
		   

	}

}
