package com.java.leetcode;

import java.util.HashMap;
import java.util.Map;

public class IntToRomanSolution {
	public static String intToRoman(int num){
		//leetcode 12.Integer to Roman
		String roman = "";
		Map<Integer,String> map1 = new HashMap<Integer,String>(){
			{
				put(1,"I");
				put(2,"II");
				put(3,"III");
				put(4,"IV");
				put(5,"V");
				put(6,"VI");
				put(7,"VII");
				put(8,"VIII");
				put(9,"IX");
				put(0,"");
			}
		};
		
		Map<Integer,String> map10 = new HashMap<Integer,String>(){
			{
				put(1,"X");
				put(2,"XX");
				put(3,"XXX");
				put(4,"XL");
				put(5,"L");
				put(6,"LX");
				put(7,"LXX");
				put(8,"LXXX");
				put(9,"XC");
				put(0,"");
			}
		};
		
		Map<Integer,String> map100 = new HashMap<Integer,String>(){
			{
				put(1,"C");
				put(2,"CC");
				put(3,"CCC");
				put(4,"CD");
				put(5,"D");
				put(6,"DC");
				put(7,"DCC");
				put(8,"DCCC");
				put(9,"CM");
				put(0,"");
			}
		};
		
		Map<Integer,String> map1000 = new HashMap<Integer,String>(){
			{
				put(1,"M");
				put(2,"M");
				put(3,"MMM");
				put(0,"");
			}
		};
		
		roman += map1000.get(num/1000%10) + map100.get(num/100%10) + map10.get(num/10%10) + map1.get(num%10);
		return roman;
	}
	
	/*/
	 * another simple solution
	 */
	
	public static String intToRoman2(int num){
		int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
		String[] strs = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
	    String roman = "";
		for(int i = 0; i < values.length;i++){
			while(num >= values[i]){
				num -= values[i];
				roman += strs[i];
			}
		}
		return roman;
	}
	
	public static void main(String[] args){
		int num = 2769;
		System.out.println(intToRoman2(num));
	}
}
