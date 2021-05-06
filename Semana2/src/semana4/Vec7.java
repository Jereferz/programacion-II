package semana4;

import java.util.Scanner;

public class Vec7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner read = new Scanner(System.in);
		
		int A [] = new int [10];
		int i;
		for (i=0;i<=9;i++) {
			A[i]=(int)(Math.random()*99+0);
		}
		int guardar=0;
		for (int n=0;n<=9;n++) {
			for (i=0;i<=8;i++) {
				
					if (n!=i) {
						if (A[n]==A[i]) {
							A[i]=0;
						}
					}
			}
		}
		int f =0;
		System.out.println("Numeros del array sin repetidos: ");
		while(f<=9) {
			System.out.println(A[f]);
			f++;
		}
	}

}
