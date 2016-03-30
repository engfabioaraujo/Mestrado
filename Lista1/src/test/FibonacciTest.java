package test;

import static org.junit.Assert.*;

import org.junit.Test;

import main.FibonacciRecursive;

public class FibonacciTest {

	@Test
	public void test() {			
		FibonacciRecursive fib_recursive = new FibonacciRecursive();		
		
		assertEquals(0, fib_recursive.fibonacci(0).longValue());
		assertEquals(1, fib_recursive.fibonacci(1).longValue());
		assertEquals(1, fib_recursive.fibonacci(2).longValue());
		assertEquals(2, fib_recursive.fibonacci(3).longValue());
		assertEquals(3, fib_recursive.fibonacci(4).longValue());
		assertEquals(5, fib_recursive.fibonacci(5).longValue());
		assertEquals(8, fib_recursive.fibonacci(6).longValue());
		assertEquals(13, fib_recursive.fibonacci(7).longValue());
		assertEquals(55, fib_recursive.fibonacci(10).longValue());
	}

}
