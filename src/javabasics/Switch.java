package javabasics;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		
		System.out.println("enter any value between 1 to 10");
		
		int a= sc.nextInt();
		
		switch (a)
		{
		
		case 1 :
			System.out.println("sunday");
			break;
		case 2 :
			System.out.println("monday");
			break;
		case 3 :
			System.out.println("Tuesday");
			break;
		case 4 :
			System.out.println("Wednesday");
			break;
		case 5 :
			System.out.println("Thirsday");
			break;
		case 6 :
			System.out.println("Friday");
			break;
		default :
			System.out.println("Holiday");
		
		}
	}

}
