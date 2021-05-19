package semana1;

import java.util.Scanner;

public class act2 {

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
		System.out.println(nombres[0]);
		System.out.println(nombres[1]);
		System.out.println(nombres[2]);
		System.out.println(nombres[3]);
		
		boolean relacion=true;
		do {
			System.out.println("Ingrese su Usuario: ");
			compararN=read.nextLine();
			System.out.println("Ingrese su contraseña: ");
			compararC=read.nextLine();
			if (compararN.equals(nombres[i]) && compararC.equals(contra[i])) {
				relacion=false;
		        System.out.println("Bienvenida/o.");
		        
		    } else {
		    	System.out.println("¡¡ERROR!! Usuario o contraseña incorrectos.");
		    
		        relacion=true;
		    }	
			i=i+1;
		} while (relacion==true);
	}

}
