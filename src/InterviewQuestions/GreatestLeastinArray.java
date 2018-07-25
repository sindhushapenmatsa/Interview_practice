package InterviewQuestions;

public class GreatestLeastinArray {

	public static void main(String[] args) {
		
		
		int arr[]={1,2,3,4,5};
		
		int greatestnum = arr[0];
		int leastnum = arr[0];
		
		for(int i=0;i<=arr.length-1;i++){
			
			if(arr[i]> greatestnum)
			{
				greatestnum = arr[i];
			}
			
			else if(arr[i]< leastnum)
			{
				leastnum = arr[i];
			}
			
			
		}
		
		System.out.println(greatestnum);
		System.out.println(leastnum);
		
		

	}

}
