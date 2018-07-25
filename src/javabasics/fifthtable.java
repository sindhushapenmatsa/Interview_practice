package javabasics;

import java.util.Scanner;

public class fifthtable {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		 int a = sc.nextInt();
		 
		 for(int i=1;i<=10;i++)
		 {
		 System.out.print(a + "x" + i + "=" + a*i );
		 System.out.print("\n");
	
		 }
	}

}
