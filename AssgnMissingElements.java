package week1.day2;

import java.util.Arrays;

public class AssgnMissingElements {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 2, 6, 4, 7, 11, 9 };// 1 2 3 4 6 7 9 11 (5,8,10)

		Arrays.sort(arr);
		int arr1 = arr.length;// 8
		

		for (int i = 0; i <arr1; i++) {
			if (i!=(arr1-1)) {
			if(arr[i+1]!= arr[i]+1){

				System.out.println("Missing element" + (arr[i]+1));
             
			} 
		
	}
}
}
}