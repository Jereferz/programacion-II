package repaso;

import java.util.Scanner;

public class App2 {
	public static void main(String[] args) {
		//Escribir un programa que reciba dos n�meros por consola e imprima todos los n�meros enteros entre esos dos n�meros.
		int A;
		int B;
		Scanner v1 = new Scanner(System.in);
		Scanner v2 = new Scanner(System.in);
	    A = v1.nextInt();	
	    B = v2.nextInt();
	    do {
	    	System.out.println("Numeros del medio: "+A);
	    	A = A+1;
	    }while (A<B);

	}
}
