package servicios;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Scanner;

import controladores.Inicio;
import dtos.AlumnoDto;

public class AlumnoImplementacion implements AlumnoInterfaz{

	Scanner sc=new Scanner(System.in);
	
	private long idAutomatico() {
		
		long idAutomatico;
		int tamanioLista=Inicio.listaAlumnos.size();
		
		if(tamanioLista==0) {
			
			idAutomatico=1;
		}
		else {
			idAutomatico=tamanioLista-1;
		}
		
		return idAutomatico;
	}
	public void altaAlumno(List<AlumnoDto> listaAlumnos) {
		
		AlumnoDto alumno=new AlumnoDto();
		
		try {
			alumno.setIdAlumno(idAutomatico());
			
			System.out.println("Introduzca el nombre del alumno: ");
			String nombre=sc.nextLine();
			alumno.setNombreAlumno(nombre);
			
			System.out.println("Introduzca los apellidos del alumno: ");
			String apellidos=sc.nextLine();
			alumno.setApellidosAlumno(apellidos);
			
			System.out.println("Introduzca el DNI del alumno: ");
			String dni=sc.nextLine();
			alumno.setDniAlumno(dni);
			
			System.out.println("Introduzca el email del alumno: ");
			String email=sc.nextLine();
			alumno.setEmailAlumno(email);

			System.out.println("Introduzca la fecha de nacimiento del alumno(dd-MM-yyyy): ");
			DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String fechaNacimientoAlumnoString=sc.nextLine();
			LocalDate fechaNacimientoAlumnno = LocalDate.parse(fechaNacimientoAlumnoString, formatoFecha);
			alumno.setFchNacimientoAlumno(fechaNacimientoAlumnno);
			
			System.out.println("Introduzca el telefono del alumno: ");
			int telefono=sc.nextInt();
			alumno.setTelefonoAlumno(telefono);
			
			listaAlumnos.add(alumno);
			
		}catch(Exception error) {
			System.out.println("ERROR: ".concat(error.toString()));
		}
		
	}
	
	public void modificarAlumno(List<AlumnoDto> listaAlumnos) {
		
		System.out.println("Introduzca el DNI del alumno a modificar: ");
		String dniAModificar=sc.next();
		
		for(AlumnoDto alumnos: listaAlumnos) {
			
			if(alumnos.getDniAlumno().equals(dniAModificar)) {
				
				System.out.println("Es valido");
			}
			else {
				
				System.out.println("No es valido");
			}
		}
	}
}
