package semana2_3;

import java.util.Scanner;

public class Vista {

	/*public static void mostrarPersona(Persona p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
	}*/
	public static void mostrarCiudadano(Ciudadano c) {
		System.out.println("Nombre:    "+c.getObra_social());
		System.out.println("Nombre:    "+c.getNombre());
		System.out.println("Apellido:  "+c.getApellido());
		System.out.println("Provincia: "+c.getProvincia());
		System.out.println("Documento: "+c.getDni());
		System.out.println("Numero de Afiliado: "+c.getN_afiliado());
		System.out.println();
	};
	public static Ciudadano entregarCiudadano() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Ingrese Obra Social:");
		String Os = scanner.next();
		System.out.println("Ingrese nombre:");
		String nom = scanner.next();
		System.out.println("Ingrese apellido");
		String ape = scanner.next();
		System.out.println("Ingrese Provincia");
		String Provi = scanner.next();
		System.out.println("Ingrese Dni:");
		long dni = scanner.nextInt();
		System.out.println("Ingrese Numero de afiliado:");
		long afiliado = scanner.nextInt();
		
		Ciudadano ciuda = new Ciudadano(Os,nom,ape,Provi,dni,afiliado);
		return ciuda;
	};
}
