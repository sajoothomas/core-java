package com.test.recursive;

public class RecursiveFactorial {

	
	// 5! = 5 x 4 x 3 x2 x1
	
	public static int factorial(int n) {
		
		if (n==1)
			return 1;
		
		return n * factorial(n-1);
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.out.println(factorial(12));

	}

}
