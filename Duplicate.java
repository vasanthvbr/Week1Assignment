package week3.day1;
import java.util.Arrays;
public class Duplicate {
	public static void main(String[] args) {
		//declare an array
		int [] array1= {1,6,2,4,3,5,6};
		//convert array as assending order
		Arrays.sort(array1);
		//iterate value using for loop
		for (int i = 0; i < array1.length; i++)
		{
			//iterate value using for loop
			for (int j = i+1; j < array1.length; j++)
			{
				//comparing both are equal
				if(array1[i]==array1[j])
				{
					System.out.println(array1[i]);
				}
			}
			
		}
		
	}

}
