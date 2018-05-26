package com.test.datastruc;

public class MyQueue<T> {

	Object[] array;
	int front;
	int rear = -1;
	int SIZE = 5;

	public MyQueue() {
		array = new Object[SIZE];
	}

	public T put(T message) throws Exception {

		if ((front > rear) && front <= (SIZE - 1)) {
			array[front] = message;
			front++;

		} else if (front >= (SIZE - 1) && rear > 0) {
			front = 0;
			array[front] = message;
			front++;
		}

		else {
			throw new Exception("Queue is full");
		}

		return (T) array[front - 1];
	}

	public T push() {
		if (rear == -1)
			rear = 0;

		rear++;
		return (T) array[rear - 1];

	}

	public void display() {
		for (int i = 0; i < SIZE; i++)
			System.out.println(i + "=" + array[i]);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
