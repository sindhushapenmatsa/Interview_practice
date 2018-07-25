package Advancedjava;

public class This {
	
	int z =50;
	
	int add(int x,int y){
		
		int z;
		z=x+y;
		System.out.println(this.z);
		return z;	
	}
	
    int mul(int x,int y){
		
    	
		z=x+y;
		System.out.println(this.z);
		return z;
    }
	
	
	

	public static void main(String[] args) {
		
		This obj = new This();
		int a = obj.add(2,3);
		System.out.println("new add z is" + a);
		

	}

}
