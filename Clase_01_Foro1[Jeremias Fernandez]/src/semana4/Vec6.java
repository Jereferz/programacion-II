package semana4;

import java.util.Scanner;

public class Vec6 {

	public static void main(String[] args) {
		
		Scanner read = new Scanner(System.in);
		
		int A [] = new int [5];
		int i;
		boolean repeat = true;
		for (int n=0;n<=4;n++) {
			System.out.print("Ingrese valor a guardar: ");
			A[n]=read.nextInt();
			for (i=0;i<=3;i++) {
				if (n!=i) {
					if (A[n]==A[i]) {
					repeat = false;
					}
				}
			}
			if (repeat) {
				A[i] = n;
				i = i+1;
			} else {
				System.out.println("Elemento repetido, vuelva a ingresar un numero no repetido");
			}
			repeat= true;
		}
		/*for (int n=0;n<=4;n++) {
			System.out.print("Ingrese valor a guardar: ");
			A[n]=read.nextInt();
			for (i=0;i<=3;i++) {
				if (n!=i) {
				if (A[n]==A[i]) {
					A[i]=0;
				}
			}
			}
			
		}*/
		/*int guardar=0;
		for (int n=0;n<=4;n++) {
			for (i=0;i<=3;i++) {
				
					if (n!=i) {
						if (A[n]==A[i]) {
							A[i]=0;
						}
					}
			}
		}*/
		
		System.out.println("Numeros del array sin repetidos: ");
		int n=0;
		while(n<=4) {
			System.out.println(A[n]);
			n++;
		}
	}

}
