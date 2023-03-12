package week3.day3;

public class ChangeOddIndexToUpperCasse {
	public static void main(String[] args) {
		// Declare a string
		String text = "testleaf";
		System.out.println(text);
		//converrt string into array
		char[] charArray= text.toCharArray();
		//using for loop according to the condition
		for (int i = 0; i < charArray.length; i++) {
			
			// condition to find add one
			if(i%2!=0) {
				//convert lower case to upper case
				charArray[i]=Character.toUpperCase(charArray[i]);
				
			}
			System.out.print(charArray[i]);
			
		}
	
}
}
