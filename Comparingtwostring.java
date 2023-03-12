package week3.day3;

import java.util.Scanner;

public class Comparingtwostring {
	public static void main(String[] args)
	{
		//Gets input from user using scanner and named as text1
		Scanner text1 = new Scanner(System.in);
		System.out.println("Text1");
		//input is stored as a string
		String nextLine= text1.nextLine();
		//converrt string into array
		char[] characters=nextLine.toCharArray();
		
		//Gets input from user using scanner and named as text2
		Scanner text2 = new Scanner(System.in);
		System.out.println("text2");
		//input is stored as a string
		String nextLine1= text2.nextLine();
		//converrt string into array
		char[] characters1=nextLine1.toCharArray();
		//compare two strings are equal
		if(text1==text2) {
			//if it is match the given string is both are equal
			System.out.println("both are equal");
		}
		else
		{
			////if it is match the given string both are not equal
			System.out.println("both are not equal");
		}
	}

}
