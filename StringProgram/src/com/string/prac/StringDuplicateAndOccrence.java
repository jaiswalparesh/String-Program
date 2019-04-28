package com.string.prac;

import java.util.HashMap;
import java.util.Map;

public class StringDuplicateAndOccrence {
	public static void main(String[] args) {
		String s = "Bread butter and bread";

		StringDuplicateAndOccrence duplicate = new StringDuplicateAndOccrence();
		Map<String, Integer> wordMap = duplicate.getDuplicateString(s);
		duplicate.displayOccrence(wordMap);
	}

	private Map<String, Integer> getDuplicateString(String s) {
		Map<String, Integer> map = new HashMap<>();
		String[] arr = s.split(" ");
		for (String word : arr) {
			if (map.containsKey(word.toLowerCase())) {
				map.put(word.toLowerCase(), map.get(word.toLowerCase()) + 1);
			} else {
				map.put(word.toLowerCase(), 1);
			}
		}
		return map;
	}

	private void displayOccrence(Map<String, Integer> wordMap) {
		wordMap.entrySet().stream().forEach(System.out::println);
	}
}
