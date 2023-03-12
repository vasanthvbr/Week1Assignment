package week3.day3;

public class Intersection {
	public static void main(String[] args) {
		//declare two array
		int[] a = {3,5,6,9,6,4,1};
		int[] b = {11,12,2,3,7,8};
		//iterate value using for loop
		for (int i = 0; i < a.length; i++) {
			//iterate value using for loop
			for (int j = 0; j < b.length; j++) {
				
			//check both are equal
				if(a[i]==b[j]) {
					System.out.println(a[i]);
				}
				
			}
			
			
		}
	}

}
