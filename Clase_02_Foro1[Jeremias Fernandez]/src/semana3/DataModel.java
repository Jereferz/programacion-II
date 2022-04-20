package semana3;

public class DataModel {
	public static void saveCB(ContactBook saCB) {
		String data = saCB.toString("&%&");
		String nombre = "DatosC2.txt";
		GestorArchivos.guardar(nombre,data);
	}
	
}
