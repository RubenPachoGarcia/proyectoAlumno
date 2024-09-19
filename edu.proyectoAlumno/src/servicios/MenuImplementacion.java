package servicios;

import java.util.Scanner;

public class MenuImplementacion implements MenuInterfaz{

	Scanner sc = new Scanner(System.in);
	
	public byte menuPrincipal() {
		
		byte opcionUsuario;
		
		System.out.println("BIENVENIDO");
		System.out.println("-----------------");
		System.out.println("0. Cerrar Menu");
		System.out.println("1. Alta alumno");
		System.out.println("2. Modificar alumno");
		System.out.println("3. Eliminar alumno");
		System.out.println("-----------------");
		System.out.println("Seleccione la opcion que desee: ");
		
		opcionUsuario=sc.nextByte();
		
		return opcionUsuario;
	}
}
