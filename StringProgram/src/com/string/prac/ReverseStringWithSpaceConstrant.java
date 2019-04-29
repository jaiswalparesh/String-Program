package com.string.prac;

public class ReverseStringWithSpaceConstrant {

	public static void main(String[] args) {
		String s = "i am not human";

		ReverseStringWithSpaceConstrant reverse = new ReverseStringWithSpaceConstrant();
		System.out.println(reverse.reverseString(s));
	}

	public String reverseString(String s) {
		char[] inputArr = s.toCharArray();
		char[] resultArr = new char[inputArr.length];

		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] == ' ') {
				resultArr[i] = ' ';
			}
		}
		int j = resultArr.length - 1;
		for (int i = 0; i < inputArr.length; i++) {
			if (inputArr[i] != ' ') {
				if (resultArr[j] == ' ') {
					j--;
				}
				resultArr[j] = inputArr[i];
				j--;
			}
		}
		return String.valueOf(resultArr);
	}
}
