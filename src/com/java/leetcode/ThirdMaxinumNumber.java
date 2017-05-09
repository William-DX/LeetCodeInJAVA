package com.java.leetcode;

public class ThirdMaxinumNumber {
	public int thirdMax(int[] nums){
		int min = Integer.MIN_VALUE;
		int mid = Integer.MIN_VALUE;
		int max = Integer.MIN_VALUE;
		for(int num : nums){
			if(num == max || num == mid || num == min) continue;
			if(num > max){
				min = mid;
				mid = max;
				max = num;
			}
			else if(num > mid){
				min = mid;
				mid = num;
			}else if(num > min){
				min = num;
			}
		}
		if(nums.length < 3 || min == Integer.MIN_VALUE){
			return max;
		}else{
			return min;
		}
		
	}
}
