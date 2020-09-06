package com.leetcode.arrays;

public class DuplicateZeros {

	public static void main(String[] args) {

		int[] arr = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int n = arr.length;

		Utils.printArray(arr, n, "Original Array");
		duplicateZeros(arr);
		Utils.printArray(arr, n, "After Duplication");

	}

	static void duplicateZeros(int[] arr) {
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
