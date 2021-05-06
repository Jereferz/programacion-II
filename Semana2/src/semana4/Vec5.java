package semana4;

import java.util.Scanner;

public class Vec5 {

		public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		int A [] = new int [5];
		int i;
		for (i=0;i<=4;i++) {
			System.out.print("Ingrese valor a guardar: ");
			A[i]=read.nextInt();
		}
		int guardar=0;
		for (int n=0;n<=4;n++) {
			for (i=0;i<=3;i++) {
				if (A[i]>A[i+1]) {
					guardar = A[i];
					A[i]=A[i+1];
					A[i+1]=guardar;
				}
			}
		}
		int f =0;
		System.out.println("Numeros del array ordenados: ");
		while(f<=4) {
			System.out.println(A[f]);
			f++;
		}
	}

}
