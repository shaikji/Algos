package com.leetcode.arrays;

public class DuplicateZeros {

	public static void main(String[] args) {

		//int[] arr = { 1, 0, 2, 0, 0, 0, 0, 0 };
		int[] arr= {8,4,5,0,0,0,0,7};
		int n = arr.length;

		Utils.printArray(arr, n, "Original Array");
		duplicateZeros(arr);
		Utils.printArray(arr, n, "After Duplication");

	}

	static void duplicateZeros(int[] arr) {

		int n = arr.length;
		int last = n-1;
		int pos_dup = 0;

		for (int i = 0; i <= last - pos_dup ; i++) {
			if ( arr[i] == 0 ) {
				if ( i == last - pos_dup) {
					arr[last] = 0;
					last--;
					break;
				}
				
				pos_dup++;
			}
		}
		
		System.out.println(pos_dup);

	


	}

	static void duplicateZeros2(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] == 0) {
				for (int j = n - 1; j > i; j--)
					arr[j] = arr[j - 1];
				i++;
			}
		}
	}

}
