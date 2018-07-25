package javabasics;

import java.util.Scanner;

public class Displayarray {

	public static void main(String[] args) {
		String[] a = new String[6];
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter array values");
		
		for(int i=0;i<a.length;i++)
			a[i]=sc.next();
		
		for(String b : a)
			System.out.println(b);

	}

}
