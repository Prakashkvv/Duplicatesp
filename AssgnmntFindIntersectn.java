package week1.day2;

import java.util.Arrays;

public class AssgnmntFindIntersectn {

	public static void main(String[] args) {
		
		int[]arr1 = {3,4,2,1,8,9,10,5,6,7};
		
		int[]arr2 = {2,4,6,7,10,9};
		 
		Arrays.sort(arr1);
		
		Arrays.sort(arr2);
		
		for(int i = 0; i < arr1.length; i++) {
			
	    for(int j = 0; j < arr2.length; j++) {
	    	
	    	if (arr1 [i] == arr2[j]) {
	    		
	    	System.out.println(arr1[i]);
	    	}
		}
			
		}
  
		

	}

}
