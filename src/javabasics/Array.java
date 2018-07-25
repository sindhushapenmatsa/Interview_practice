package javabasics;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		
		int[] a = new int[5];
		
		Scanner sc = new Scanner(System.in);
		// read values
		System.out.println("enter array values");
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		//displaying values
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
	}

}
