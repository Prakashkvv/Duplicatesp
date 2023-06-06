package week1.day2;

import java.util.Arrays;

public class FindSecondLargest {

	public static void main(String[] args) {
	 int [] num = {3,2,4,6,8,10};
	 Arrays.sort(num);
	 
	 System.out.println(num.length);
	 
	 int array1 = num.length ; 
	 
System.out.println("The second largest no is " + num [array1 - 2]);
		
	}

}
