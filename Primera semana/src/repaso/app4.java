package repaso;

import java.util.Scanner;

public class app4 {
	public static void main(String[] args) {
		//Escribir un programa similar al anterior, pero que no imprima los múltiplos de 5. Por ejemplo, si se ingresaron los números 22 y 18, el programa debe imprimir 18 19 21 22.w
		int A, B, I;
		int C = 5;
		Scanner v1 = new Scanner(System.in);
		Scanner v2 = new Scanner(System.in);
		A = v1.nextInt();	
	    B = v2.nextInt();
	    
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
