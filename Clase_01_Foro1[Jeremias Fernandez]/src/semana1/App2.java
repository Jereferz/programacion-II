package semana1;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		//Escribir un programa que reciba dos n�meros por consola e imprima todos los n�meros enteros entre esos dos n�meros.
		int A;
		int B;
		Scanner v1 = new Scanner(System.in);
	    A = v1.nextInt();	
	    B = v1.nextInt();
	    do {
	    	A = A+1;
	    	System.out.println("Numeros del medio: "+A);
	    }while (A<B);
	} 
}
