package javaCode;

import java.util.Random;

public class ArrayShufflle {
	public static void main(String[] args) {
		int[] myArray = { 1, 2, 3, 4, 5, 6, 7 };

		shuffleArray(myArray);

		for (int i = 0; i < myArray.length; i++) {
			System.out.print(myArray[i] + " ");
		}
	}

	static void shuffleArray(int[] arr) {
		int n = arr.length;
		Random rand = new Random();
		for (int i = n - 1; i > 0; i--) {
			int j = rand.nextInt(i + 1);
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
		}
	}
}
