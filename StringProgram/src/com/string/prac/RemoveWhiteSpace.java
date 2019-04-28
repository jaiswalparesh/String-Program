package com.string.prac;

public class RemoveWhiteSpace {
	public static void main(String[] args) {
		String s = "Helow World";
		char[] arr = s.toCharArray();
		for (int  i = 0 ; i< arr.length; i++) {
			if(arr[i] != ' ' ) {
				System.out.print(arr[i]);
			}
		}
	}
}
