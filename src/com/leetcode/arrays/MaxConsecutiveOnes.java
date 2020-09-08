package com.leetcode.arrays;

class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        
        int len = 0;
        int maxLen = 0;
        
        for ( int i=0; i < nums.length; i++){
            
        	// Count number of 1s
            if ( nums[i] == 1 ) {
            	len++;
            } else {
            	maxLen = Math.max(len, maxLen);
                len =0 ;
            }
        }
        return Math.max(len, maxLen);
    }
    
    public static void main( String[] args ) {
    	int[] nums = { 1,0,1,1,0,1,1,0,1,1,1,1,0,0,1,1};
    	System.out.println(" max length = " + findMaxConsecutiveOnes(nums));
    }
}