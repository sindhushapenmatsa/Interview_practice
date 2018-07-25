package Advancedjava;

public class maths {
	
	static void add(int x, int y)
	   {
		int z;
		z=x+y;
		System.out.println(z);
	   }
	int sub(int x, int y)
	   {
		int z;
		z=x-y;
		return z;
	   }

	int mul(int x, int y)
	   {
		int z;
		z=x*y;
		return z;
	   }
	
	public static void main(String[] Args){
		
		maths obj = new maths();
		add(3,1);
		int a = obj.sub(4,5);
		System.out.println(a);
		
	}
	
	
}

