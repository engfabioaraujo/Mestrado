package main;

import java.math.BigInteger;

import util.PerformanceAvaliation;

public class RecursiveExperiments {	
	public static void main(String[] args) {				 
		
		final int EVENTSFOR25 = 182;
		final int EVENTSFOR50 = 357;
		final int EVENTSFOR75 = 532;
		final int EVENTSFOR100 = 707;				
		
		BigInteger result = BigInteger.ZERO;
		long startTime = 0;
		long stopTime = 0;
		long elapsedTime = 0;				
	    
		//Fibonacci Recursivo 25
		startTime = System.currentTimeMillis();
		
		FibonacciRecursive fib_recursive = new FibonacciRecursive();
		result = fib_recursive.fibonacci(25);
		
		stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    if(elapsedTime == 0)
	    	elapsedTime = 1;	    
	    	    
	    System.out.println("************************************************************************************");
	    System.out.println("************************Fibonacci Recursive of 25***********************************");
	    System.out.println("");	    
	    System.out.println("Fibonacci: " + result);
	    System.out.println("Time: " + elapsedTime);
	    
	    PerformanceAvaliation pe = new PerformanceAvaliation();
	    System.out.println("Throughput: " + pe.throughput(EVENTSFOR25, elapsedTime));
	    System.out.println("MIPS: " + pe.mips(EVENTSFOR25, elapsedTime));
	    
	    System.out.println("");
	    System.out.println("************************************************************************************");
	    
		//Fibonacci Recursivo 50
		startTime = System.currentTimeMillis();
		
		fib_recursive = new FibonacciRecursive();
		result = fib_recursive.fibonacci(50);
		
		stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    if(elapsedTime == 0)
	    	elapsedTime = 1;
	    
	    System.out.println("************************************************************************************");
	    System.out.println("************************Fibonacci Recursive of 50***********************************");
	    System.out.println("");	    
	    System.out.println("Fibonacci: " + result);
	    System.out.println("Time: " + elapsedTime);
	    
	    pe = new PerformanceAvaliation();
	    System.out.println("Throughput: " + pe.throughput(EVENTSFOR50, elapsedTime));
	    System.out.println("MIPS: " + pe.mips(EVENTSFOR50, elapsedTime));
	    
	    System.out.println("");
	    System.out.println("************************************************************************************");
	    
		//Fibonacci Recursivo 75
		startTime = System.currentTimeMillis();
		
		fib_recursive = new FibonacciRecursive();
		result = fib_recursive.fibonacci(75);
		
		stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    if(elapsedTime == 0)
	    	elapsedTime = 1;

	    System.out.println("************************************************************************************");
	    System.out.println("************************Fibonacci Recursive of 75***********************************");
	    System.out.println("");	    
	    System.out.println("Fibonacci: " + result);
	    System.out.println("Time: " + elapsedTime);
	    
	    pe = new PerformanceAvaliation();
	    System.out.println("Throughput: " + pe.throughput(EVENTSFOR75, elapsedTime));
	    System.out.println("MIPS: " + pe.mips(EVENTSFOR75, elapsedTime));
	    
	    System.out.println("");
	    System.out.println("************************************************************************************");
	    	    
		//Fibonacci Recursivo 100
		startTime = System.currentTimeMillis();
		
		fib_recursive = new FibonacciRecursive();
		result = fib_recursive.fibonacci(100);
		
		stopTime = System.currentTimeMillis();
	    elapsedTime = stopTime - startTime;
	    if(elapsedTime == 0)
	    	elapsedTime = 1;
	    
	    System.out.println("************************************************************************************");
	    System.out.println("************************Fibonacci Recursive of 100**********************************");
	    System.out.println("");	    
	    System.out.println("Fibonacci: " + result);
	    System.out.println("Time: " + elapsedTime);
	    
	    pe = new PerformanceAvaliation();
	    System.out.println("Throughput: " + pe.throughput(EVENTSFOR100, elapsedTime));
	    System.out.println("MIPS: " + pe.mips(EVENTSFOR100, elapsedTime));
	    
	    System.out.println("");
	    System.out.println("************************************************************************************");	    	  
	}
}
