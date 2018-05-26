package com.test.datastruc;


import org.junit.Test;

public class MyStackTest {

	@Test
	public void testPush() throws Exception {
		MyStack mystack = new MyStack();
		mystack.push("m1");
		mystack.push("m1");
		mystack.push("m1");
		mystack.push("m1");
		//mystack.push("m1");
		//mystack.push("m1");
		mystack.display();
	}

}
