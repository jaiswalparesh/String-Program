package com.string.prac;

public class ReverseEachWordOfString {
	public static void main(String[] args) {
		String s = "Java is very wast";

		ReverseEachWordOfString rev = new ReverseEachWordOfString();
		System.out.println(rev.reverseWordInString(s));
	}

	public String reverseWordInString(String s) {
		String[] strArr = s.split(" ");

		String reverseWord = "";

		for (String string : strArr) {
			String charString = string;
			String reversechar = "";
			for (int j = charString.length() - 1; j >= 0; j--) {
				reversechar = reversechar + charString.charAt(j);
			}
			reverseWord = reverseWord + reversechar+ " ";
		}
		return reverseWord;
	}
}
