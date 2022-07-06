package paquete;

public class controller {

	public static void main(String[] args) {
		Provider proveedor = null;
		int leer = 0;
		do {
			leer = View.menu();
			
			  if (leer == 1) {
				  proveedor = View.registerProvider(new Provider());
				  System.out.println(proveedor);
			  }else if (leer == 2) {
				  //provider medicine1 = view.addingMedicine(proveedor);
			  }
			 
		}while(leer!=4);
	}
}
