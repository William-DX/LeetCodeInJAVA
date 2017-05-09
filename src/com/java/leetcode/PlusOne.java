package com.java.leetcode;
/*
 *Given a non-negative integer represented as a non-empty array of digits, plus one to the integer.
 *You may assume the integer do not contain any leading zero, except the number 0 itself.
 *The digits are stored such that the most significant digit is at the head of the list.
 */
public class PlusOne {
	//leetcode 66.Plus one
	public int[] plusOne(int[] digits) {
		int overflow = 1;
        if(digits.length == 0){
        	return null;
        }
        for(int i = digits.length - 1;i >= 0;i--){
        	if(digits[i] < 9){
        		digits[i] += overflow;
        		return digits;
        	}else{
        		digits[i] = 0;
        	}
        }
        int[] arr = new int[digits.length + 1];
        arr[0] = 1;
        for(int i = 1;i < arr.length;i++){
        	arr[i] = digits[i - 1];
        }
        return arr;
    }
}
