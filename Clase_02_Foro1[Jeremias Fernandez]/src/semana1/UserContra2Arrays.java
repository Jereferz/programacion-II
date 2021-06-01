package semana1;

import java.util.Scanner;

public class UserContra2Arrays {

	public static void main(String[] args) {
		String nombres [] = new String[4] ;
		nombres [0] = "Daiana";
		nombres [1] = "Facundo";
		nombres [2] = "Osvaldo";
		nombres [3] = "Melina";
		String contra [] = new String[4];
		contra [0]="1234";
		contra [1]="4321";
		contra [2]="1122";
		contra [3]="3344";
		Scanner read = new Scanner(System.in);
		String compararN;
		String compararC;
		int i=0;
		int opcion;
		String nuecontra;
		boolean usererronea = false;
		boolean contraerronea = false;
		boolean relacion = false;
		System.out.println("Ingrese su Usuario: ");
		compararN=read.nextLine();
		System.out.println("Ingrese su contraseña: ");
		compararC=read.nextLine();
		for (i=0;i<4;i++) {
			if (compararN.equals(nombres[i]) && compararC.equals(contra[i])) {
				relacion=true;
			}
			if (compararN.equals(nombres[i])==true) {
				usererronea=true;
			}
			if (compararC.equals(contra[i])==true) {
				contraerronea=true;
			}
		}
		if (relacion) {
			System.out.println("Bienvenido");
			System.out.println("1. Cambiar la contraseña");
			System.out.println("2. No cambiar contraseña");
			System.out.print("Opción: ");
			opcion=read.nextInt();
			if (opcion==1) {
				System.out.println("Ingrese nueva contraseña");
				nuecontra=read.next();
				compararC=nuecontra;
				System.out.println("Su contraseña fue cambiada a "+ compararC);
			}else {
				System.out.println("Vuelva prontos");
			}
		}
		if (relacion==false) {
			if (usererronea==false) {
				System.out.println("Su usuario esta mal escrito");
			}
			if (contraerronea==false){
				System.out.println("Su contraseña esta mal escrita");
			}
			System.out.println("Contraseña y/o usuario incorrecta");
		}
	}

}
