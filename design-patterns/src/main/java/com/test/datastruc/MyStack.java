package com.test.datastruc;

public class MyStack {

	private String[] stack;
	private int top = 0;
	private int size=5;

	public MyStack() {
		stack = new String[size];
	}

	public int push(String message) throws Exception{

		if (top >= size)
			throw new Exception("Stack is full");

		stack[top] = message;
		top++;

		return top;

	}
	
	public void display() {
		for (String text : stack)
			System.out.println(text);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
