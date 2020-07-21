package com;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestFlipkartLogin {
	@Test
	public void testLogin() {
		FlipkartLogin flipkartlogin=new FlipkartLogin();
		
		Assertions.assertEquals("mahabira01@gmail.com", flipkartlogin.login());
	}
	@Test
	public void testLogins() {
		FlipkartLogin flipkartlogin=new FlipkartLogin();
		
		Assertions.assertNotEquals(null, flipkartlogin.login());
	}
	@Test
	public void testPassword() {
		FlipkartLogin flipkartlogin=new FlipkartLogin();
		
		Assertions.assertEquals(97293033, flipkartlogin.password());
	}
	@Test
	public void testPasswords() {
		FlipkartLogin flipkartlogin=new FlipkartLogin();
		
		Assertions.assertNotEquals(null, flipkartlogin.password());
	}
}
