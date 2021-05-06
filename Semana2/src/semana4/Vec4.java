package semana4;

import java.util.Scanner;

public class Vec4 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A [] = new int [5];
		int B [] = new int [5];
		int i;
		for (i=0;i<4;i++) {
			System.out.print("Ingrese valor a guardar: ");
			A[i]=read.nextInt();
			if (A[i]%7!=0) {
				B[i]=A[i];
			}
			
		}
		for (i=0;i<4;i++) {
				System.out.println("Indice del vector: "+i+" Valor ingresado: "+B[i]);
		}
	}

}
