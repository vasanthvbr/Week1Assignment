package week3.day3;

public class Factorial {
	public static void main(String[] args) {
		//declare an variable
		int a =5;
		int fact = 1;
		//iterate value using for loop
		for (int i = 1; i <=a; i++) {
			//multiple i with fact
			fact=fact*i;
			
		}
		//print fact
		System.out.println(fact);
		
	}

}
