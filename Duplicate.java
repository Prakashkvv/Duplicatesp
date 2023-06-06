package week1.day2;

import java.util.Arrays;

public class Duplicate {

	public static void main(String[] args) {
	int [] num = {2,2,5,7,7,9,9,3,5};
	
	Arrays.sort(num);
	
	int length = num.length;

	System.out.println("Length of Array: "+ length);

	for (int i = 0; i < num.length; i++) {
		
		for (int j = i+1; j < num.length; j++) {
			
		if (num[i] == num[j]) {
				
	System.out.println("Duplicates in Arrays: "+ num[i]);
				
			}
			
		}
		
	}
	
	
	
}
}