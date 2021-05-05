package paque1;

public class Controlador {
	
	public static void main(String[] args) {
		
		persona miPersona = new persona("Vonku","Enzo");
		ciudadano miCiudadano = new ciudadano("Mza",500000000,"Enzo","Vonku");
		
		Vista.mostrarPersona(miPersona);
		Vista.mostrarCiudadano(miCiudadano);
	}
}
