package com.java.leetcode;

public class SearchInsertArray {
	//leetcode 35.Search Insert Position
	//binary search
	 public int searchInsert(int[] nums, int target) {
	        if(nums.length == 0) return -1;
	        
	        int lowerbound = 0;
	        int upperbound = nums.length - 1;
	        
	        while(lowerbound <= upperbound){
	        	int curIn = (lowerbound + upperbound) / 2;
	        	if(nums[curIn] == target){
	        		return curIn;
	        	}else if(nums[curIn] < target){
	        		lowerbound = curIn + 1;
	        	}else{
	        		upperbound = curIn - 1;
	        	}
	        }
	        return lowerbound;
	 }
}
