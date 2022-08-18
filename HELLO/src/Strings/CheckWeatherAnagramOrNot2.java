package Strings;

import java.util.Scanner;

public class CheckWeatherAnagramOrNot2 {

	public CheckWeatherAnagramOrNot2() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String a = sc.nextLine();
		String b = sc.nextLine();
		boolean isAnagram = false;
		boolean visited[] = new boolean[b.length()];
		if (a.length() == b.length()) {
			for (int i = 0; i < a.length(); i++) {
				char c = a.charAt(i);
				isAnagram = false;
				for (int j = 0; j < b.length(); j++) {
					if (!(b.charAt(j) == c && !visited[j])) {
						visited[j] = true;
						break;
					}
				}
				if (!isAnagram) {
					break;
				}
			}
			if (isAnagram) {
				System.out.println("The given Strings are Anagram");
			} else {
				System.out.println("The given Strings are not Anagram");
			}
		}
		if (a.length() != b.length()) {
			System.out.println("The given Strings are not Anagram");
		}
	}
}
