package semana1;

import java.util.Scanner;

public class act1 {

	public static void main(String[] args) {
		String frases [] = new String[4] ;
		Scanner read = new Scanner(System.in);
		for (int i=0;i<frases.length;i++) {
			System.out.println("Ingrese una frase: ");
			frases[i]=read.nextLine();
			
		}
		for (int i=0;i<frases.length;i++) {
			System.out.println(+i+" Su frase es: "+frases[i]);
		}
	}

}
