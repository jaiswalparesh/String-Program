package com.string.prac;

public class ReverseStringWithoutRecursion {
	public static void main(String[] args) {
		String s = "Hello World";
		ReverseStringWithoutRecursion reverse = new ReverseStringWithoutRecursion();
		System.out.println("Approch 1");
		reverse.reverseString1(s);
		System.out.println();
		System.out.println("Approch 2");
		System.out.println(reverse.reverseString2(s));
		System.out.println("Approch 3");
		System.out.println(reverse.reverseStringUsingStringBuilder(s));
	}

	private void reverseString1(String s) {
		char[] arr = s.toCharArray();
		for (int i = arr.length - 1; i >= 0; i--) {
			System.out.print(arr[i]);
		}
	}

	public String reverseString2(String s) {
		char temp;
		char[] arr = s.toCharArray();
		for (int i = 0; i < arr.length / 2; i++) {
			temp = arr[i];
			arr[i] = arr[arr.length - 1 - i];
			arr[arr.length - 1 - i] = temp;
		}
		return String.valueOf(arr);
	}

	public String reverseStringUsingStringBuilder(String s) {
		return new StringBuilder(s).reverse().toString();
	}
}
