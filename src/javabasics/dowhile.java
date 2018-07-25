package javabasics;

import java.util.Scanner;

public class dowhile {
		
		public static void main(String[] args) {
			Scanner sc = new Scanner (System.in);
			System.out.println("Enter the number");
			 int a = sc.nextInt();
			 int i = 1;
			 
			 do
			 {
			System.out.println(i);
			i=i+1;
	 
			 } while (i<=a);

	}

}
