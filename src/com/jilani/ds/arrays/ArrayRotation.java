package com.jilani.ds.arrays;

public class ArrayRotation {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		int d = 2;
		int n = arr.length;
		Utils.printArray(arr, n, "Before rotation");
		rotate(arr, n, d);
		Utils.printArray(arr, n, "After rotation");

		int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };
		n = arr2.length;
		d = 2;
		Utils.printArray(arr2, n, "Before rotation");
		rotate2(arr2, n, d);
		Utils.printArray(arr2, n, "After rotation");
		
		int[] arr3 = { 1, 2, 3, 4, 5, 6, 7 };
		n = arr3.length;
		d = 10;
		Utils.printArray(arr3, n, "Before rotation");
		rotate2(arr3, n, d);
		Utils.printArray(arr3, n, "After rotation");

	}

	// Rotate using temporary array
	// Time - O(n)
	// Space - O(d)
	static void rotate(int[] arr, int n, int d) {

		d = d % n;

		if (d == 0)
			return;

		int[] temp = new int[d];
		for (int i = 0; i < d; i++)
			temp[i] = arr[i];

		int k = 0;
		for (int i = d; i < n; i++) {
			arr[k] = arr[i];
			k++;
		}

		for (int i = 0; i < d; i++) {
			arr[k] = temp[i];
			k++;
		}
	}

	// Method 2 - rotate one element at a time
	// Time - O( n*d)
	// Space - O(1)
	static void rotate2(int[] arr, int n, int d) {

		for (int k = 1; k <= d; k++) {
			// Rotate once
			int temp = arr[0];
			for (int i = 0; i < n - 1; i++)
				arr[i] = arr[i + 1];
			arr[n - 1] = temp;
		}
	}

	// Method 3: Juggling Method
	// Time - 
	void rorate3(int[] arr, int n, int d) {

		d = d % n;
		int gcd = Utils.gcd(n, d);

		for (int i = 1; i <= gcd; i++) {

			int temp = arr[i];
			int j = i;
			int k;
			
			while ( true ) {
				k = (j + d)%n;
				if ( k == i)
					break;
				arr[j] = arr[k];
				j = k;
			}
			
			arr[j] = temp;
		}
	}
}
