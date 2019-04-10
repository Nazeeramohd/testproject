package com.qa.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DemoTest1 {
	
	@Test
	public void sum() {
		int a=10;
		int b=20;
		Assert.assertEquals(30, a+b);
	}
@Test
	public void mul() {
		int a=10;
		int b=20;
		Assert.assertEquals(200, a*b);
	}
	
@Test
	public void div() {
		int a=10;
		int b=20;
		Assert.assertEquals(2, b/a);
	}

	
}