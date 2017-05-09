package com.java.leetcode;

public class RomanToInteger {
	public static int romanToInteger(String s){
		//leetcode 13.Roman to Integer
		char[] ch = s.toCharArray();
		int sum = 0;
		for(int i = 0;i < ch.length;i++){
			if(ch[i] == 'M'){
				sum += 1000;
			}else if(ch[i] == 'D'){
				sum += 500;
			}else if(ch[i] == 'C'){
				if(i < ch.length - 1 && ch[i + 1] == 'M'){
					sum += 900;
					i++;
				}else if(i < ch.length - 1 && ch[i + 1] == 'D'){
					sum += 400;
					i++;
				}else{
					sum += 100;
				}
			}else if(ch[i] == 'L'){
				sum += 50;
			}else if(ch[i] == 'X'){
				if(i < ch.length - 1 && ch[i + 1] == 'C'){
					sum += 90;
					i++;
				}else if(i < ch.length - 1 && ch[i + 1] == 'L'){
					sum += 40;
					i++;
				}else{
					sum += 10;
				}
			}else if(ch[i] == 'V'){
				sum += 5;
			}else if(ch[i] == 'I'){
				if(i < ch.length - 1 && ch[i + 1] == 'X'){
					sum += 9;
					i++;
				}else if(i < ch.length - 1 && ch[i + 1] == 'V'){
					sum += 4;
					i++;
				}else{
					sum += 1;
				}
			}
		}
		return sum;
	}
}
