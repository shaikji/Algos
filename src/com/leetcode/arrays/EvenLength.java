package com.leetcode.arrays;

class EvenLength {
	static public int findNumbers(int[] nums) {

		int count = 0;
		int len = 0;
		for (int i = 0; i < nums.length; i++) {
			len = findLen(nums[i]);
			if (len % 2 == 0)
				count++;
		}
		return count;
	}

	static int findLen(int n) {
		int len = 0;
		while (n > 0) {
			len++;
			n = n / 10;
		}
		return len;
	}

	public static void main(String[] args) {
		int[] arr = { 12, 345, 2, 6, 7896 };
		System.out.println(findNumbers(arr));

	}
}