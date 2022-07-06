package paquete;

public class Controller {

	public static void main(String[] args) {
		Provider proveedor = null;
		int leer = 0;
		do {
			leer = View.menu();
			if (leer == 1) {
				proveedor = View.registerProvider(new Provider());
				System.out.println(proveedor);
			} else if (leer == 2) {
				Provider medicine1 = View.addingMedicine(proveedor);
			} else if (leer == 3) {
				View.listMedicine(proveedor);
			}

		} while (leer != 4);
	}
}
