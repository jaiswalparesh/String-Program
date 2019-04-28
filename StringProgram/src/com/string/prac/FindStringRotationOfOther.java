package com.string.prac;

public class FindStringRotationOfOther {

	public static void main(String[] args) {
		String s1 = "JavaJ2eeStrutsHibernate";
		String s2 = "StrutsHibernateJavaJ2ee";
		String s3 = s1+s1;
		if(s3.contains(s2)) {
			System.out.println("String s1 is rotation of s2");
		} else {
			System.out.println("String s1 is not rotation of s2");
		}
	}

}
