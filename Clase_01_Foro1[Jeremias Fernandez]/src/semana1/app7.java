package semana1;

import java.util.Scanner;

public class app7 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String Usua = "Enzo";
		double Contr = 4321;
		System.out.println("Ingrese su usuario");
		String Usuario = read.next();
		System.out.println("Ingrese su contraseņa");
		int Contraseņa = read.nextInt();
		while (true) {
		if ((Usua != Usuario) && (Contr != Contraseņa)) {
			System.out.println("Su usuario/contraseņa es incorrecto/a");
		}else{
			System.out.println("Bienvenido.");
		}
		}
	}

}
