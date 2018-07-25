package Advancedjava;

public class Access {
	
	private void add(int x, int y){
		
		int z= x+y;
		System.out.println("sum" +z);
	}
	
    void sub(int x, int y){
		
		int z= x-y;
		System.out.println("sub" + z);
	}
	
    public void mul(int x, int y){
	
	int z= x*y;
	System.out.println("mul" +z);
}

    protected void div(int x, int y){
	
	int z= x/y;
	System.out.println("div" + z);
}

	public static void main(String[] args) {
		 
		Access obj = new Access();
		obj.div(1, 2);
		

	}

}
