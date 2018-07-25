package Advancedjava;

public class Overriding extends Overloading {
	
	void add(int x,int y){
		int z= x+y;
		System.out.println("second" + z);
	}

	public static void main(String[] args) {
		
		Overriding obj = new Overriding();
		obj.add(5, 7);
	}

}
