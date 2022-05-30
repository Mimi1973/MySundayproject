package ArrayClass;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
public class ArryQuiz1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int myIntarray = getinteger(5);
		System.out.println("getinteger:" );
		
		int sortedArray = sortIntegers(myIntarray);
		System.out.println("sortInteger:" );
		
		printArray(sortedArray);
		System.out.println("Print Array:" );
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter 5 numbers in Array");
		int descending = in.nextInt();
		
		int X;
		}

		private static void printArray(int sortedArray) {
		// TODO Auto-generated method stub
		
	}

		private static int sortIntegers(int myIntarray) {
		// TODO Auto-generated method stub
		return 0;
	}

		public static int getinteger(int number) {
		// TODO Auto-generated method stub
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter any five number in Array");
		
		int[]values = new int[number];
		for(int i = 0; i< values.length; i ++) {
			System.out.println("Enter Value:" + i);
			values [i] = in.nextInt();
		
		}
		in.close();		
		return 0;
		}

/*		public static int sortIntegers(int array) {
			// TODO Auto-generated method stub
			
			Scanner in = new Scanner(System.in);
			System.out.println("Enter any number in array");
			in.nextInt();

			System.out.println("This is Descending order");
			{
				Integer arr[] = { 106, 26, 81, 5, 51 };

				Arrays.sort(arr, Collections.reverseOrder());

				System.out.println(Arrays.toString(arr));
			}
			in.close();
			return 0;
		}
		
		
		private static void printArray(int sortedArray) {
		// TODO Auto-generated method stub
		
	*/		
			
	}


	



