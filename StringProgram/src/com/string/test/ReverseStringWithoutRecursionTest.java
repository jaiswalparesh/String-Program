package com.string.test;

import org.junit.Assert;
import org.junit.Test;

import com.string.prac.ReverseStringWithoutRecursion;

public class ReverseStringWithoutRecursionTest {
	
	@Test
	public void testResverseString1() {
		ReverseStringWithoutRecursion reverse = new ReverseStringWithoutRecursion();
		Assert.assertEquals("dlroW olleH", reverse.reverseString2("Hello World"));
	}

	@Test
	public void testResverseString2() {
		ReverseStringWithoutRecursion reverse = new ReverseStringWithoutRecursion();
		Assert.assertEquals("dlroW olleH", reverse.reverseStringUsingStringBuilder("Hello World"));
	}
	
}
