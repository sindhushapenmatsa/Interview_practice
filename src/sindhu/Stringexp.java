package sindhu;

public class Stringexp {

	public static void main(String[] args) {
		
		String a="Sindhu";
		String b="Ganesh";
		
//		
////		1) Append second string to first string and 
////	   store in first string:
//	   a = a + b; //SindhuGanesh 12  6
//
////	2) call the method substring(int beginindex, int endindex)
////	   by passing beginindex as 0 and endindex as,
////	      a.length() - b.length():
//	   b = a.substring(0,a.length()-b.length()); //Sindhu
//	   System.out.println(a.length());
//	   System.out.println(b.length());
//
////	3) call the method substring(int beginindex) by passing 
////	   b.length() as argument to store the value of initial 
////	   b string in a
//	   a = a.substring(b.length());  
//	   System.out.println(b.length());
//	   
//	   System.out.println(a );
//	   System.out.println(b );

		System.out.println(a.substring(0, 2));
		
		
	}

}
