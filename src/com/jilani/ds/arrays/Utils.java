package com.jilani.ds.arrays;

public class Utils {
	
	static void printArray( int[] arr, int n, String msg) {
		
		System.out.println();
		System.out.println(msg);
		System.out.println("--------------------------------");
		
		for ( int i=0; i < n; i++)
			System.out.print(arr[i] + " ");
		System.out.println();
	}

	public static int gcd(int n, int d) {
		// Assuming n > d
		if ( d == 0 )
			return n;
		return gcd(d,n%d);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(gcd(15,0));
	}

}
