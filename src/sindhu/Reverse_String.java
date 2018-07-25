package sindhu;

public class Reverse_String {

	public static void main(String[] args) {
		String s ="123456";
		
		int len = s.length();
		String rev ="";
		
		for(int i=len-1;i>=0;i--)
		{
			
			 rev =rev + s.charAt(i);
			
		}
		
		System.out.println(rev);

		
		
		
	}

	
	
	
}
