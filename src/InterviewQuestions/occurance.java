package InterviewQuestions;

import java.util.Arrays;

public class occurance {

	public static void main(String[] args) {

		int[] num = { 1, 2, 3, 4, 1, 2, 3, 6, 7, 5, 3, 2, 1, 1, 2, 3 };

		Arrays.sort(num);

		// 1111222233334567

		int size = num.length;

		int temp = 0; // 1

		for (int i = 0; i < size; i++) {

			if (i < size - 1) {

				if (num[i] != temp) {

					if (num[i] == num[i + 1]) {

						System.out.println(num[i] + " occur multiple times");
						temp = num[i];
					}

					else

					{

						System.out.println(num[i] + " occur only once");
					}

				}

			} //size
			
			else
			{
				
				System.out.println(num[i] +  " occur only once");
			}

		}

	}

}
