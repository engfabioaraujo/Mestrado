package main;

import java.math.BigInteger;

public class FibonacciRecursive {
	//Calculates the fibonacci of a number of Recursive way.
	public BigInteger fibonacci(int n) throws IllegalArgumentException {			
		
		if (n < 0){
			throw new IllegalArgumentException("Enter a number greater than or equal to 0");
		}
		
		if(n == 0 || n == 1)
			return BigInteger.valueOf(n);
		else
			return fibonacci(n-1).add(fibonacci(n-2));				
	}	
}

/************************************
 * 
 *  Nesse método recursivo iremos considerar como evento/instrução importante a ser contado 
 *  para a avalição as operações:
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
 *  Operações de atribuição = 0 x cr
 *  Operações matemáticas = 1 x cr
 *  Operações booleanas = 2 x cr
 *  Operações de intanciação = 0 x cr
 *  Operações de Incremento/Decremento = 0 x cr
 *  Operações de Decisão = 2 x 2 x cr  
 *  
 *  cr = Chamadas Recursivas   
 *  
 *  Considerando y como sendo a quantidade de instruções que ocorrem dentro de nosso programa, temos:
 *  
 *  y = 1cr + 2cr + 4cr
 *  y = 7cr
 *  
 *  cr = n + 1
 *  
 *  Sendo n = 25, cr = 26,   y = 182
 *  Sendo n = 50, cr = 51,   y = 357
 *  Sendo n = 75, cr = 76,   y = 525
 *  Sendo n = 100, cr = 101, y = 707
 * 
 * 
 *************************************/
