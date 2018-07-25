package javabasics;

import java.util.Scanner;

public class forloop {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the number");
		 int a = sc.nextInt();
	//reverse order display	 
		 for (int i=a;i>0;i--)
			 System.out.println(i);

	}

}
