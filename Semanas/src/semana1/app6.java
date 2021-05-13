package semana1;

import java.util.Scanner;

public class app6 {
	public static void main(String[] args) {
		//Modifique el programa anterior (conservándolo) para que le advierta al usuario si el tercer número ingresado es mayor o igual a la diferencia entre los dos primeros. Por ejemplo si el usuario ingresa 22, 18 y 6 debe advertir al usuario que 6 es un número no permitido porque es mayor a 22 menos 18.
		int A, B, I, C, R;
		Scanner v1 = new Scanner(System.in);
		A = v1.nextInt();	
	    B = v1.nextInt();
	    
	    R = A-B;
	  
		do {
			C = v1.nextInt();
			//System.out.print(R);
			if (C>=R) {
		    	System.out.println("El numero: "+C+" no se permite porque es mayor o igual que la diferencia de "+A+" y "+B);
		    }else{
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
			}}}}
			//System.out.print(C);
			}while (C>=R);
	}
}
	
		    
	    
