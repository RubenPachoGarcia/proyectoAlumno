package servicios;

import java.util.List;

import dtos.AlumnoDto;

public interface AlumnoInterfaz {

	public void altaAlumno(List<AlumnoDto> listaAlumnos);
	
	public void modificarAlumno(List<AlumnoDto> listaAlumnos);
}
