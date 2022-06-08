package semana3;

import java.util.Scanner;

public class Vec6 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A [] = new int [5];
		
		//Programa para que almacene 5 valores en un vector y
		//que no puedan ingresar repetidos.
		int valorU; //lo que ingresa el usuario
		for (int n=0;n<A.length;n++) {
			System.out.print("["+n+"] = ");
			boolean repeat=true;
			valorU=read.nextInt();
			if (valorU!=0) {
				
			}
			for (int i=0;i<A.length;i++) {
				if (valorU==A[i]) {
					repeat=false;
				}
			}
			if (repeat==false) {
				System.out.println("Numero ya ingresado. Ingrese otro");
				n=n-1;
				
			}else {
				A[n]=valorU;
			}
			
		}
		System.out.println("Numeros del array sin repetidos: ");
		for (int c=0;c<A.length;c++) {
			System.out.println(" "+c+" "+A[c]);
		}
	}

}
