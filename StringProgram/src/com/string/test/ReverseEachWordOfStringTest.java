package com.string.test;

import org.junit.Assert;
import org.junit.Test;

import com.string.prac.ReverseEachWordOfString;

public class ReverseEachWordOfStringTest {

	@Test
	public void test1() {
		ReverseEachWordOfString s = new ReverseEachWordOfString();
		Assert.assertEquals("avaJ si yrev tsaw ", s.reverseWordInString("Java is very wast"));
	}
}
