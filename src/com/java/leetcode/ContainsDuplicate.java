package com.java.leetcode;

import java.util.HashSet;
import java.util.Set;

/*
 * Given an array of integers, find if the array contains any duplicates. 
 * Your function should return true if any value appears at least twice in the array, 
 * and it should return false if every element is distinct.
 */
public class ContainsDuplicate {
	public boolean containDuplicate(int[] nums){
		if(nums.length < 2){
			return false;
		}
		Set<Integer> set = new HashSet<Integer>();
		//通过判断能添加到set中来判断是否有重复
		for(int i = 0;i < nums.length;i++){
			if(!set.add(nums[i])) return true;
		}
		return false;
	}
}
