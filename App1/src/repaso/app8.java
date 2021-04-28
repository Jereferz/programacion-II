package repaso;

import java.util.Scanner;

public class app8 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		String Usua = "Enzo";
		double Contr = 4321;
		System.out.println("Ingrese su usuario");
		String Usuario = read.next();
		System.out.println("Ingrese su contraseña");
		int Contraseña = read.nextInt();
		if ((Usua != Usuario) && (Contr != Contraseña)) {
			System.out.println("Su usuario/contraseña es incorrecto/a");
		}else{
			System.out.println("Bienvenido.");
			System.out.println("¿Desea actualizar su contraseña?");
			System.out.println("1. Nueva contraseña.");
			System.out.println("2. Continuar navegando.");
			int option = read.nextInt();
			if (option == (1)); {
				System.out.println("Ingrese su nueva contraseña");
				int newc = read.nextInt();
				System.out.println("Su contraseña ha sido establecida.");
				System.out.println("Su contraseña es "+ newc);
		    if (option == (2)){
		    	System.out.println("Bienvenido Enzo");
		    }
			
		}
		}
	}
}
