package week3.day3;

public class Plindrom {
	public static void main(String[] args) {
		//declaring the variable
	String 	str ="Madam";
	//declare the empty string
	String rev= "";
	//convert the string into character array
	char[] charArray=str.toCharArray();
	//iterate the loop using reverse for loop
	for (int i = charArray.length-1; i >=0; i--) {
		//store the iterate value in rev String
		rev = rev +charArray[i];
	}
	System.out.println(rev);
	//compare both are equal
	if(str.equals(rev)) {
		//if it is match the given string is plaindrom
		System.out.println("it is a palindrom");
	}
	else {
		//if not the given string is not a plindrom
		System.out.println("it is not a palindrom");
	}
}
}
