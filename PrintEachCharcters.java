package week3.day2;

public class PrintEachCharcters {
	public static void main(String[] args) {
		//declare am string
		String text = "testleaf";
		//convert string into array
		char[] characters=text.toCharArray();
		//iterate value using for loop
		for (int i = 0; i < characters.length; i++) {
			System.out.println(characters[i]);
		}
		
	}
}
