package paquete;

public class controller {

	public static void main(String[] args) {
		provider proveedor = null;
		int leer = 0;
		do {
			leer = view.menu();
			
			  if (leer == 1) {
				  proveedor = view.registerProvider(new provider());
				  System.out.println(proveedor);
			  }
			 
		}while(leer!=4);
	}
}
