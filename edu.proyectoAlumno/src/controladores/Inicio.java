package controladores;

import java.util.ArrayList;
import java.util.List;

import dtos.AlumnoDto;
import servicios.AlumnoImplementacion;
import servicios.AlumnoInterfaz;
import servicios.MenuImplementacion;
import servicios.MenuInterfaz;

/**
 * Clase principal de la aplicacion
 * @author rpg
 * 19092024
 */
public class Inicio {
	
	public static List<AlumnoDto> listaAlumnos = new ArrayList<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MenuInterfaz mi=new MenuImplementacion();
		AlumnoInterfaz ai=new AlumnoImplementacion();
		
		byte control;
		boolean cerrarMenu=false;
			
		while(!cerrarMenu) {
			
			control=mi.menuPrincipal();
			
			try {
				switch(control) {
				case 0:
					System.out.println("Se cierra la aplicacion");
					cerrarMenu=true;
					break;
				case 1:
					System.out.println("Has seleccionado la opcion Alta alumno");
					ai.altaAlumno(listaAlumnos);
					for(AlumnoDto alumnos: listaAlumnos) {
						
						System.out.println(alumnos.toString());
					}
					break;
				case 2:
					System.out.println("Has seleccionado la opcion Modificar alumno");
					ai.modificarAlumno(listaAlumnos);
					break;
				case 3:
					System.out.println("Has seleccionado la opcion Eliminar alumno");
					break;
				default:
					System.out.println("La opcion seleccionada no existe");
					break;
				}
			}catch(Exception error){
				System.out.println("ERROR: ".concat(error.toString()));
			}
		}
	}

}
