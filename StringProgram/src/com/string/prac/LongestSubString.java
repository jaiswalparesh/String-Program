package com.string.prac;

import java.util.LinkedHashMap;

public class LongestSubString {

	public static void main(String[] args) {
		String s = "javaconceptoftheday";
		LongestSubString subString = new LongestSubString();
		subString.findLongestSubString(s);
	}

	private void findLongestSubString(String s) {
		String longestSubString = "";
		int size = 0;
		char[] ch = s.toCharArray();
		LinkedHashMap<Character, Integer> linkedHashMap = new LinkedHashMap<>();

		for (int i = 0; i < ch.length; i++) {
			if (!linkedHashMap.containsKey(ch[i])) {
				linkedHashMap.put(ch[i], i);
			} else {
				i = linkedHashMap.get(ch[i]);
				linkedHashMap.clear();
			}

			if (linkedHashMap.size() > size) {
				size = linkedHashMap.size();
				longestSubString = linkedHashMap.keySet().toString();
			}
		}
		System.out.println("Longest Substring is : " + longestSubString + " with size : " + size);
	}

}
