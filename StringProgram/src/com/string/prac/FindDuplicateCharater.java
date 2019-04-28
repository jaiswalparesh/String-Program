package com.string.prac;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharater {
	public static void main(String[] args) {
		String s = "abacdeaacbrr";
		FindDuplicateCharater chr = new FindDuplicateCharater();
		chr.findDupicate(s);
	}

	private void findDupicate(String s) {
		char[] arr = s.toCharArray();
		Map<Character, Integer> map = new HashMap<>();
		for (char c : arr) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			}else if(c != ' ') {
				map.put(c, 1);
			}
		}
		map.entrySet().stream().forEach(System.out::println);
	}
}
