package ArrayQuiz;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class QuizArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("Enter any number in array");
		in.nextInt();

		System.out.println("This is Descending order");
		{
			Integer arr[] = { 106, 26, 81, 5, 51 };

			Arrays.sort(arr, Collections.reverseOrder());

			System.out.println(Arrays.toString(arr)); // Descending order
		}

	}
}
