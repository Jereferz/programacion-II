package repaso;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		//Escribir un programa que, modificando el anterior, imprima los números enteros entre los dos ingresados siempre de menor a mayor, independientemente del orden en que los ingresó el usuario. Por ejemplo, si se ingresaron los números 20 y 17, el programa debe imprimir 17 18 19 20.
		int A;
		int B;
		Scanner v1 = new Scanner(System.in);
		Scanner v2 = new Scanner(System.in);
		A = v1.nextInt();	
	    B = v2.nextInt();
	    
		if (A>B){
			do {
		    	System.out.println("Numeros del medio: "+B);
		    	B = B+1;
		    }while (B<=A);	    
	    }else{
	    	do {
		    	System.out.println("Numeros del medio: "+A);
		    	A = A+1;
		    }while (A<=B);	    	
	    }

	}

}
