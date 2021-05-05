package paque1;

public class Vista {

	public static void mostrarPersona(persona p) {
		System.out.println(p.getNombre());
		System.out.println(p.getApellido());
	}
	public static void mostrarCiudadano(ciudadano c) {
		System.out.println(c.getProvincia());
		System.out.println(c.getDni());
	}
}
