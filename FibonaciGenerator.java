package com.rtjvm.java.lectures.codetest;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FibonaciGenerator {
	
	
	/**
	 * To get the nth value in the fibonacci sequence
	 * @param n
	 * @return
	 */
	public static BigInteger fibonacci(int n) {

        if (n <= 1) return BigInteger.valueOf(n);

        BigInteger previous =BigInteger.ZERO, next = BigInteger.ONE, sum;

        for (int i = 2; i <= n; i++) {

            sum = previous;
            previous = next;
            next = sum.add(previous);
        }

        return next;
    }
	
	/**
	 * To get the fibonacci sequence up to the limit n
	 * @param n
	 * @return
	 */
	public static List<BigInteger> getFibonacciSequence(int n){
		List<BigInteger> sequence = new ArrayList<BigInteger>();
		for (int i = 0; i < n; i++) {			  
			sequence.add(fibonacci(i));
		 }		
		return sequence;
		
	}  
	
	public static void testMe() {
		System.out.println("Just a test method");
	}
	public static void testMeBranch() {
		System.out.println("Just a test method from branch");
	}

}
