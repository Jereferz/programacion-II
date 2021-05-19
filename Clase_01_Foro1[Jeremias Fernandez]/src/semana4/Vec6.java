package semana4;

import java.util.Scanner;

public class Vec6 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A [] = new int [5];
		int i;
	
		int valorU; //lo que ingresa el usuario
		for (int n=0;n<A.length;n++) {
			System.out.print("Ingrese valor a guardar: ");
			boolean repeat=true;
			valorU=read.nextInt();
			for (i=0;i<A.length;i++) {
				if (valorU==A[i]) {
					repeat=false;
				}
			}
			if (repeat==false) {
				System.out.println("Numero ya ingresado. Ingrese otro");
				n=n-1;
			}
			A[n]=valorU;		
		}
		System.out.println("Numeros del array sin repetidos: ");
		int n=0;
		while(n<A.length) {
			System.out.println(A[n]);
			n++;
		}
	}

}
