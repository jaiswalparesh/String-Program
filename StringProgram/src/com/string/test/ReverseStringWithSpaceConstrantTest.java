package com.string.test;

import org.junit.Assert;
import org.junit.Test;

import com.string.prac.ReverseStringWithSpaceConstrant;

public class ReverseStringWithSpaceConstrantTest {

	@Test
	public void test1(){
		ReverseStringWithSpaceConstrant constrant = new ReverseStringWithSpaceConstrant();
		Assert.assertEquals("n am uht onmai", constrant.reverseString("i am not human"));
	}
}
