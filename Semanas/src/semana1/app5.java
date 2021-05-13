package semana1;

import java.util.Scanner;

public class app5 {
	public static void main(String[] args) {
		//Escribir un programa similar al anterior, pero que no imprima los múltiplos de un número también ingresado por el usuario. Por ejemplo, si se ingresaron los números 22, 18 y 3 el programa debe imprimir 19 20 22.
		int A, B, I, C;
		Scanner v1 = new Scanner(System.in);
		A = v1.nextInt();	
	    B = v1.nextInt();
	    C = v1.nextInt();
	    	 if (A>=B){
	    		 for (I=B;B<=A;B++) {
			    	if (B%C!=0) { 
			    	System.out.println(" "+B);
			    	}    
	    		 }
		    }else{
		    	for (I=A;A<=B;A++) {
		    		if (A%C!=0){ 
		    		System.out.println(" "+A);
			}}}
	}
}
