package javaCode;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class PanagramOrNot {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sentence: ");
		String input = sc.nextLine().toLowerCase();

		boolean isPangram = isPangram(input);

		if (isPangram) {
			System.out.println("The input is a pangram..");
		} else {
			System.out.println("The input is not a pangram..");
		}
	}

	public static boolean isPangram(String input) {

		Set<Character> uniqueLetters = new HashSet<>();

		for (char c : input.toCharArray()) {
			if (c >= 'a' && c <= 'z') {

				uniqueLetters.add(c);
				if (uniqueLetters.size() == 26) {
					return true;
				}
			}
		}
		return false;
	}
}
