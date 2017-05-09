package com.java.leetcode;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
	public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        List<Integer> rows;
        for(int i = 0;i < numRows;i++){
        	rows = new ArrayList<Integer>();
        	for(int j = 0;j <= i;j++){
        		if(j == 0 || j == i){
        			rows.add(1);
        		}else{
        			rows.add(list.get(i-1).get(j-1) + list.get(i-1).get(j));
        		}
        	}
        	list.add(rows);
        }
        return list;
    }
}
