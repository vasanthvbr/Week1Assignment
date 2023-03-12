package week3.day3;

import java.util.Arrays;

public class Anagram {
	public static void main(String[] args) {
		//declaring a String
		String str1="race";
		String str2="care";
		//Comparing both string
		if(str1.length() == str2.length() ) {
			System.out.println("length are equal");
		}
		else {
			System.out.println("Not equal");
		}
		//convert string into array
		char[] charArray=str1.toCharArray();
		char[] charArray2=str2.toCharArray();
		
		// convert into assending order
		Arrays.sort(charArray);
		Arrays.sort(charArray2);
		
	    //comapring both the string
		if(Arrays.equals(charArray, charArray2)) {
			//if it is match the given string is anagram
			System.out.println("The given string ia anagram");
		}
		else {
			//if it is match the given string is not anagram
			System.out.println("not Anagram");
		}
	}

}
