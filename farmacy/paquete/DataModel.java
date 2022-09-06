package paquete;

import paquete.Provider;
import paquete.GestorArchivos;

public class DataModel {
	public static void saveCB(Provider saCB) {
		String data = saCB.toString("&%&");
		String nombre = "DatosFarmacy2.txt";
		GestorArchivos.guardar(nombre,data);
	}
	
}
