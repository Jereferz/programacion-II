package repaso;

import java.util.Scanner;

public class app7 {

	private static Scanner read;

	public static void main(String[] args) {
		read = new Scanner(System.in);
		String Usua = "Enzo";
		double Contr = 4321;
		System.out.println("Ingrese su usuario");
		String Usuario = read.next();
		System.out.println("Ingrese su contrase�a");
		int Contrase�a = read.nextInt();
		if ((Usua != Usuario) && (Contr != Contrase�a)) {
			System.out.println("Su usuario/contrase�a es incorrecto/a");
		}else{
			System.out.println("Bienvenido.");
		}
		
	}

}