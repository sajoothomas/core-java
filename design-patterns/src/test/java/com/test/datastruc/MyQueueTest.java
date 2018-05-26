package com.test.datastruc;

import org.junit.Test;

public class MyQueueTest {

	@Test
	public void testPut() throws Exception  {
		MyQueue<String> myqueue = new MyQueue<>();
		myqueue.put("m1");
		myqueue.put("m2");
		myqueue.put("m3");
		myqueue.put("m4");
		
		myqueue.put("m5");
		System.out.println("get" + myqueue.push());
		
		myqueue.put("m6");	
		
		myqueue.display();
	}

}
