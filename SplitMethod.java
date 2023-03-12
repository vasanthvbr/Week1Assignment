package week3.day3;

public class SplitMethod {
	public static void main(String[] args) {
		//declare a string with values
		String text = "Amazon has 20,000 employees @ &in Chennai";
		//split the array
		String[] split= text.split(" ");
		System.out.println(split.length);
		//count is used to find the values
		int count=0;
		//iterate value using for loop
		for (int i = 0; i < split.length; i++) {
			System.out.println(split[i]);
			//count is incresing
			count++;
		}
		System.out.println(count);
		
				
	}
}
