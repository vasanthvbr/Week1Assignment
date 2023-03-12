package week3.day2;

public class PrintReverseCharacters {
	public static void main(String[] args) {
		//declare an string
		String text="vasanth";
		//convert string into array
		char[] characters=text.toCharArray();
		//iterate value using for loop
		for (int i = characters.length-1; i>= 0 ; i--) {
			System.out.println(characters[i]);
		}
}
}
