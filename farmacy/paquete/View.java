package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class View {
	//Menu inicial que ve el usuario
	public static int menu() {
		Scanner read =new Scanner(System.in);
		int leer = 0;
		System.out.println("1. Agregar Proveedor");
		System.out.println("2. Agregar Medicamento");
		System.out.println("3. Mostrar inventario");
		System.out.println("4. Salir");
		//Excepcion para que no inserte simbolos ni letras
		try {
			leer = read.nextInt();
		}catch (InputMismatchException o) {
			System.out.println("No letras, no simbolos");
			System.out.println("Coloca un numero permitido");
		}
		return leer;
	}
	//menu numero 1 para ingresar proveedor
	public static Provider registerProvider(Provider p) {
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese Datos del Proveedor");
		System.out.println("Ingrese el codigo");
		//int codeP = read.nextInt();
		int codeP = 4444;
		System.out.println("Ingrese el nombre");
		//String nameP = read.next();
		String nameP = "VeriFarma";
		System.out.println("Ingrese el phone");
		//int numberP = read.nextInt();
		int numberP = 263565276;
		System.out.println("Ingrese el adress");
		//String adressP = read.next();
		String adressP = "Calle cerro Aconcagua";
		//provider proveedor = new provider(codeP,nameP,numberP,adressP);
		p.setCode(codeP);
		p.setName(nameP);
		p.setPhone(numberP);
		p.setAdress(adressP);
		return p;
	}
	public static Provider addingMedicine(Provider newmedicine) {
		int code;
		String name;
		int amount;
		double unit_price;
		Scanner read = new Scanner(System.in);
		System.out.println("Agregue nueva medicina");
		System.out.println("Codigo: ");
		code = read.nextInt();
		System.out.println("Nombre: ");
		name = read.next();
		System.out.println("Cantidad: ");
		amount= read.nextInt();
		System.out.println("Precio x unidad: ");
		unit_price = read.nextDouble();
		Medicine medicine = new Medicine(code,name,amount,unit_price);
		newmedicine.addMedicine(medicine);
		return newmedicine;
	}
	public static void listMedicine(Provider PM) {
		System.out.println("Lista de las medicinas");
		System.out.println(PM);
	}
}
