package week3.day2;

import java.util.Arrays;

public class MissingElements {
	public static void main(String[] args) {
		//declare an array 
		int[] number= {1,4,8,2,3,6,7};
		//output=5
		
		//convert into assending order
		Arrays.sort(number);
		//iterate value using for loop
		for (int i = 0; i < number.length; i++) {
			
				//compare both are equal
				if (number[i] != i+1) {
					System.out.println(i+1);
					//use to stop the iteration
					break;
				}
			}
			
		}
	
}

