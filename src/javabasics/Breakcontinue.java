package javabasics;

import java.util.Scanner;

public class Breakcontinue {

	public static void main(String[] args) {
		
			Scanner sc = new Scanner (System.in);
			
			while(true)
			{
				System.out.println("enter y or n ");
				String flag =sc.next();
				
				if(flag.contentEquals("y"))
					continue;
				else
					break;
			}

	}

}
