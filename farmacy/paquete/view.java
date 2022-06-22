package paquete;

import java.util.InputMismatchException;
import java.util.Scanner;

public class view {
	//Menu inicial que ve el usuario
	public static int menu() {
		Scanner read =new Scanner(System.in);
		int leer = 0;
		System.out.println("1. Add deposit");
		System.out.println("2. Add medicine");
		System.out.println("3. Show stock");
		System.out.println("4. Exit");
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
	public static provider registerProvider(provider p) {
		Scanner read = new Scanner(System.in);
		System.out.println("Ingrese Datos del Proveedor");
		System.out.println("Ingrese el codigo");
		int codeP = read.nextInt();
		System.out.println("Ingrese el nombre");
		String nameP = read.next();
		System.out.println("Ingrese el phone");
		int numberP = read.nextInt();
		System.out.println("Ingrese el adress");
		String adressP = read.next();
		provider proveedor = new provider(codeP,nameP,numberP,adressP);
		p.setName(nameP);
		return p;
	}
}
