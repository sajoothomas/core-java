package com.test.recursive;

public class FibonacciSeries {

	//0, 1, 1, 2, 3, 5, 8
	
	
	
	
	public static int fiboRecursive(int n) {
		
		if(n==0)
			return 1;
		
		if(n==1)
			return 1;
		
		
		return fiboRecursive(n - 1) + fiboRecursive(n - 2);
		
	}
	
	
	
	public static void fiboIterative(int n) {
		
		int sum = 1;
		int prev =0;
		int temp;
		for(int i=0;i<n;i++) {
			temp = sum;
			sum = sum + prev;
			prev = temp;
			
		}
		System.out.println(sum);
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		fiboIterative(6);
		
		System.out.println(fiboRecursive(5));
	}

}
