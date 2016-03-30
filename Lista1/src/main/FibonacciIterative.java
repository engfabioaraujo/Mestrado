package main;

import java.math.BigInteger;

public class FibonacciIterative {
	
	//Calculates the fibonacci of a number of iterative way.
	public BigInteger fibonacci(int n) throws IllegalArgumentException {							
		
		if (n < 0){
			throw new IllegalArgumentException("Enter a number greater than or equal to 0");
		}
		
		BigInteger a = BigInteger.valueOf(0);
		BigInteger b = BigInteger.valueOf(1);

		// Compute Fibonacci sequence.
		for (int i = 0; i < n; i++) {
			BigInteger temp = a;
		    a = b;
		    b = b.add(temp);
		}			
	    
		return a;
	}
}


/************************************
 * 
 *  Nesse método iterativo iremos considerar como evento/instruções importante a ser contado 
 *  para a avalição as operações básicas como:
 *  
 *  1 - Operações de atribuição;
 *  2 - Operações matemáticas;
 *  3 - Operações booleanas;
 *  4 - Operações de intanciação - Deve ser multiplicada por 2 (Alocação + atribuição);
 *  5 - Operações de Incremento/Decremento - Deve ser multiplicada por 2 (atribuição + matemática);
 *  6 - Operações de Decisão (if/else) - Deve ser multiplicada por 2 (booleana + decisão);
 *  
 *  Observando isso, vemos que:
 *  
 *  Operações de atribuição = 1 + (2 x qt).
 *  Operações matemáticas= 1 x qt.
 *  Operações booleanas = 1 x qt.
 *  Operações de intanciação = 2 x 2 + (1 x qt x 2).
 *  Operações de Incremento/Decremento = 1 x qt.
 *  Operações de Decisão = 1 x 2. 
 *  
 *  Qt = Quantidade de iterações do laço for = n
 *  
 *  Considerando y como sendo a quantidade de instruções que ocorrem dentro de nosso programa, temos:
 *  
 *  y = 1 + 2n + 1n + 1n + 4 + 2n + 1n + 2 = 1 + 4 + 2 + 2n + 1n + 1n + 2n + 1n = 7 + 7n = 7(1 + n)
 *  y = 7(1 + n)
 *  
 *  Sendo n = 25, y = 182
 *  Sendo n = 50, y = 357
 *  Sendo n = 75, y = 532
 *  Sendo n = 100, y = 707
 * 
 * 
 *************************************/
