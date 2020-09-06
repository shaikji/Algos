package com.leetcode.arrays;

import java.util.Arrays;

class SortSquares {

	public static void main(String[] args) {
		int[] arr = { -9, -7, -3, -1, 0, 2, 5, 8, 12 };
		Utils.printArray(arr, arr.length, "Original Array");
		squareAndSort(arr);
		Utils.printArray(arr, arr.length, "Square Array");
		
		int[] arr2 = { -9, -7, -3, -1, 0, 2, 5, 8, 12 };
		Utils.printArray(arr2, arr2.length, "Original Array");
		square(arr2);
		Utils.printArray(arr2, arr2.length, "Square Array");
	}

	// Time - O(nlogn) for sort 
	// Space - O(1)
	static void squareAndSort(int[] arr) {

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] * arr[i];
		}

		Arrays.sort(arr);
	}
	
	// Two pointer approach
	// Time - O(n)
	// Space - O(n)
	static void square(int[] arr) {
		
		int[] temp = new int[arr.length];
		
		int i = 0; 
		int j = arr.length-1;
		int s1,s2;
		int k = j;
		
		while ( i <= j) {
			s1 = arr[i] * arr[i];
			s2 = arr[j] * arr[j];
			
			if ( s1 <= s2) {
				temp[k--] = s2;
				j--;
			} else {
				temp[k--] = s1;
				i++;
			}
		}
		
		for (  i=0; i < arr.length; i++)
			arr[i] = temp[i];
	}
 	
}