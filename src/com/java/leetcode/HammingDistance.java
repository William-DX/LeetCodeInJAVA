package com.java.leetcode;

public class HammingDistance {
	//leetcode 2.hamming distance
	public int hammingDistance(int x,int y){
		int res = 0;
        int exec = x ^ y;//�������������������
        while(exec != 0 ){
            ++res;
            exec &= (exec - 1);
        }
        return res;
	}
}
