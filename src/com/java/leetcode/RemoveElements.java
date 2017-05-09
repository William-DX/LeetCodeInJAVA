package com.java.leetcode;

public class RemoveElements {
	//leetcode 27.Remove Element
	//Given an array and a value, remove all instances of that value in place and return the new length.
	//Do not allocate extra space for another array, you must do this in place with constant memory.
	//The order of elements can be changed. It doesn't matter what you leave beyond the new length.
	public int removeElement(int[] nums, int val){
		if(nums.length == 0){
			return 0;
		}
		int count = 0;
		for(int i = 0;i < nums.length;i++){
			if(nums[i] == val) continue;
			else{
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
}
