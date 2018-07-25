package InterviewQuestions;

import java.util.Arrays;

public class nooccurinarray {

	public static void main(String[] args) {
		int[] a = { 1, 9, 8, 8, 7, 6, 5, 4, 3, 3, 2, 1 };

		Arrays.sort(a);
		// 112334567889

		int occurences = 1;
		int len = a.length;

		for (int i = 0; i < len; i++) {
			if (i < len - 1) {
				if (a[i] == a[i + 1]) {
					occurences++;
				}
			} else {
				System.out.println(a[i] + " occurs " + occurences + " time(s)"); // end
																					// of
																					// array
			}

			if (i < len - 1 && a[i] != a[i + 1]) {
				System.out.println(a[i] + " occurs " + occurences + " time(s)"); // moving
																					// to
																					// new
																					// element
																					// in
																					// array
				occurences = 1;
			}

		}
	}

}
