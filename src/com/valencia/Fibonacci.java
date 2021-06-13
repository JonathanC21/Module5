package com.valencia;

/**
 * Contains methods for calculating a Fibonacci sequence. The sequence is calculated using either a iterative or recursive method.
 * 
 */
public class Fibonacci {
	
	long iterativeTime;
	long recursiveTime;
	
	/**
	 * Calculates a fibonacci sequence using an iterative method. Also measures the time it takes to run.
	 * 
	 * @param element  The size of the sequence to generate
	 * @return Returns the time it takes to create the sequence using the given element parameter 
	 */
	public long calcIterative(int element) {
		long startTime;

		startTime = System.nanoTime();
		iterativeFunc(element);
		iterativeTime = System.nanoTime() - startTime;
		
		System.out.println("Element: " + element + "/25");
		System.out.println("Time: " + iterativeTime);
		
		return iterativeTime;
	}
	
	/**
	 * Calculates a fibonacci sequence using an recursive method. Also measures the time it takes to run.
	 * 
	 * @param element  The size of the sequence to generate
	 * @return Returns the time it takes to create the sequence using the given element parameter 
	 */
	public long calcRecursive(int element) {
		long startTime;

		startTime = System.nanoTime();
		recursiveFunc(element);
		recursiveTime = System.nanoTime() - startTime;
		
		System.out.println("Element: " + element + "/25");
		System.out.println("Time: " + recursiveTime);
		
		return recursiveTime;
	}
	
	/**
	 * Calculates the fibonacci sequence using an iterative solution
	 * 
	 * @param e The last integer element in the sequence to calculate to
	 * @return The value of the sequence at e
	 */
	public int iterativeFunc(int e) {
		
		int a = 0;
		int b = 1;
		int c = 1;
		
		for (int i = 0; i < e - 2; i++) {
			
			a = b;
			b = c;
			c = a + b;
		}
		
		return c;
	}
	
	/**
	 * Calculates the fibonacci sequence using a recursive solution
	 * 
	 * @param e The last integer element in the sequence to calculate to
	 * @return The value of the sequence at e
	 */
	public int recursiveFunc(int e) {
		
		if (e <= 2) {
			
			return 1;
		}
		
		return recursiveFunc(e -1) + recursiveFunc(e - 2);
	}
}


