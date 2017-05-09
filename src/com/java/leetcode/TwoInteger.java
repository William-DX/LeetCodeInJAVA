package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoInteger {
	//leetcode 1.
	//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
	//You may assume that each input would have exactly one solution, and you may not use the same element twice.
	public static int[] twoSum(int[] nums, int target){
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i = 0;i < nums.length;i++){
			Integer rest = (Integer)(target - nums[i]);
			if(map.containsKey(rest)){
				int[] indices = {map.get(rest),i};
				return indices;
			}
			map.put(nums[i], i);
		}
		return null;
	}
	
	public static void main(String[] args){
		int[] arr = {2,8,11,15};
		int[] indices = twoSum(arr,17);
		for(int i : indices){
			System.out.print(i + " ");
		}
	}
}
