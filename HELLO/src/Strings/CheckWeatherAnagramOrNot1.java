package Strings;

import java.util.Scanner;

public class CheckWeatherAnagramOrNot1 {

	public CheckWeatherAnagramOrNot1() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string");
		String a = sc.nextLine();
		String b = sc.nextLine();
	boolean isAnagram=false;
	if(a.length()==b.length()) {
		for(int i=0;i<a.length();i++) {
			char c=a.charAt(i);
			isAnagram=false;
			for(int j=0;j<b.length();j++) {
				if(b.charAt(j)==c) {
					isAnagram=true;
					break;
				}
			}
			if(!isAnagram) {
			break;	
			}
		}
		if (isAnagram) {
			System.out.println("The given Strings Anagram");
		}
		else {
			System.out.println("The given Strings are not Anagram");
		}
	}
	if(a.length()!=b.length()) {
		System.out.println("The given Strings are not Anagram");
	}
	}
}
