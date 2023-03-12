package week3.day2;
import java.util.Arrays;
public class Find2ndLargestNumber {

	public static void main(String[] args) 
	{
		//declara an array and store the values
	int[] number = {1,56,98,65,78,18,369,458,45};
	//convert into assending order
	Arrays.sort(number);
	//print the values
	System.out.println(number[number.length-2]);	
	}
	}

