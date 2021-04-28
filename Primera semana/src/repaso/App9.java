package repaso;

import java.util.Scanner;

public class App9 {

	public static void main(String[] args) {
		Scanner read = new Scanner (System.in);
		System.out.println("Ingrese frase a contar sus vocales: ");
		String frase = read.nextLine();
		int conta=0;
		for (int a=0; a<frase.length();a++) {
			if(
					(frase.charAt(a)=='a')||
					(frase.charAt(a)=='e')||
					(frase.charAt(a)=='i')||
					(frase.charAt(a)=='o')||
					(frase.charAt(a)=='u')
		) {
		conta++;	
			}
		}
		System.out.println("Su frase tiene "+conta+" vocales!");
	}

}
