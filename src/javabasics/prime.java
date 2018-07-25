package javabasics;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		 int a = sc.nextInt();
		 
		 for(int n= 2;n <= a;n++)
		 {
		 
		 int counter =0;
		 
		 for(int i=2;i<=n/2;i++)
		 {
			 if(n%i == 0)
				 counter =counter + 1;
		 }
		 
		 if(counter==0)
			 System.out.println(n);
		 
		 }
		 
		 	 
	}

}




/*if(counter == 0 )
System.out.println(  a + " is prime");

else
	 System.out.println(  a + " is not a prime "); */
