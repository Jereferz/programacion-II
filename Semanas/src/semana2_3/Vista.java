package semana2_3;

import java.util.Scanner;

public class Vista {

	public static void mostrarPersona(Persona p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
	}
	/*public static Persona entregarPersona() {
		
		Scanner scanner = new Scanner(System.in);
		
		
		
		Persona personita = new Persona(nom,ape);
		
		return personita;
	}*/
	public static void mostrarCiudadano(Ciudadano c) {
		System.out.println(c.getNombre());
		System.out.println(c.getApellido());
		System.out.println(c.getDni());
		System.out.println(c.getProvincia());
	};
	public static Ciudadano entregarCiudadano() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese nombre:");
		String nom = scanner.next();
		System.out.println("Ingrese apellido");
		String ape = scanner.next();
		System.out.println("Ingrese Provincia");
		String Provi = scanner.next();
		System.out.println("Ingrese Dni:");
		long dni = scanner.nextInt();
		
		Ciudadano ciuda = new Ciudadano(nom,ape,Provi,dni);
		return ciuda;
	};
}
