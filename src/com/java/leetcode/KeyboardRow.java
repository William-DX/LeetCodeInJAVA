package com.java.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Given a List of words, return the words that can be typed using letters of alphabet on 
 * only one row's of American keyboard
 */
public class KeyboardRow {
	public String[] findWords(String[] words){
		String[] strs = {"qwertyuiop","asdfghjkl","zxcvbnm"};
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(int i = 0;i < strs.length;i++){
			for(char c : strs[i].toCharArray()){
				map.put(c, i);
			}
		}
		
		List<String> list = new ArrayList<String>();
		
		for(int j = 0;j < words.length;j++){
			int index = map.get(words[j].toLowerCase().charAt(0));
			char[] ch = words[j].toLowerCase().toCharArray();
			for(char c : ch){
				if(map.get(c) != index){
					index = -1;
					break;
				}
			}
			if(index != -1) list.add(words[j]);
		}
		return (String[])(list.toArray(new String[list.size()]));
	}
}
