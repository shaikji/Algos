package com.leetcode.arrays;

public class DuplicateZeros {

	public static void main(String[] args) {

		//int[] arr = { 1, 0, 2, 0, 0, 0, 0, 0 };
		int[] arr= {8,4,5,0,0,1,0,7};
		int n = arr.length;

		Utils.printArray(arr, n, "Original Array");
		duplicateZeros(arr);
		Utils.printArray(arr, n, "After Duplication");

	}

	static void duplicateZeros(int[] arr) {

		int n = arr.length;

		int pos_dup = 0;

		for (int i = 0; i < n - 1; i++) {

			if (arr[i] == 0) {
				if (pos_dup + 1 + i < n)
					pos_dup++;
				else
					break;
			}
		}

		// Now we have the pos_duplicates.

		int k = n - pos_dup - 1;
		int j = n - 1;
		
		if ( arr[k]==0 ) {
			if ( k + 1 + pos_dup >= n) {
				arr[j]= arr[k];
				j--;
				k--;
			}
		}

		while (k >= 0) {
			if (arr[k] == 0) {
				arr[j] = 0;
				j--;
			}
			arr[j] = arr[k];
			j--;
			k--;
		}

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
