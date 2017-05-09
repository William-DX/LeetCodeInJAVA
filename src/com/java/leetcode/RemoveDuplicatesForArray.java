package com.java.leetcode;

public class RemoveDuplicatesForArray {
	//leetcode 26.Remove Duplicates from Sorted Array
	//Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
	//Do not allocate extra space for another array, you must do this in place with constant memory.
	public int removeDuplicates(int[] nums){
		if(nums.length == 0){
			return 0;
		}
		int i = 0;
		for(int j = 1;i < nums.length;i++){
			if(nums[i] != nums[j]){
				nums[++i] = nums[j];
			}
		}
		return i + 1;
	}
}
