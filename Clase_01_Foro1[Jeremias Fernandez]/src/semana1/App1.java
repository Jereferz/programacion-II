package semana1;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
	//	Escribir un programa que reciba dos números por consola y devuelva su suma.
	int A,B;
	Scanner v1 = new Scanner(System.in);
    A = v1.nextInt();	
    B = v1.nextInt();
    System.out.println("La suma de sus dos numeros es: " +(A+B));
	}

}
