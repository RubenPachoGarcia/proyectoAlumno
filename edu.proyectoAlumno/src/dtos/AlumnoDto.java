package dtos;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AlumnoDto {

	long idAlumno;
	
	String nombreAlumno="aaaaa";
	
	String apellidosAlumno="aaaaa";
	
	String dniAlumno="aaaaa";
	
	LocalDate fchNacimientoAlumno=LocalDate.now();;
	DateTimeFormatter formatoFecha = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	String fechaNacimientoAlumnnoString=fchNacimientoAlumno.format(formatoFecha);
	
	String emailAlumno="aaaaa";
	
	int telefonoAlumno=0;
	
	public long getIdAlumno() {
		return idAlumno;
	}
	
	public void setIdAlumno(long idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombreAlumno() {
		return nombreAlumno;
	}
	public void setNombreAlumno(String nombreAlumno) {
		this.nombreAlumno = nombreAlumno;
	}
	public String getApellidosAlumno() {
		return apellidosAlumno;
	}
	public void setApellidosAlumno(String apellidosAlumno) {
		this.apellidosAlumno = apellidosAlumno;
	}
	public String getDniAlumno() {
		return dniAlumno;
	}
	public void setDniAlumno(String dniAlumno) {
		this.dniAlumno = dniAlumno;
	}
	public LocalDate getFchNacimientoAlumno() {
		return fchNacimientoAlumno;
	}
	public void setFchNacimientoAlumno(LocalDate fechaNacimientoAlumnno) {
		this.fchNacimientoAlumno = fechaNacimientoAlumnno;
	}
	public String getEmailAlumno() {
		return emailAlumno;
	}
	public void setEmailAlumno(String emailAlumno) {
		this.emailAlumno = emailAlumno;
	}
	public int getTelefonoAlumno() {
		return telefonoAlumno;
	}
	public void setTelefonoAlumno(int telefonoAlumno) {
		this.telefonoAlumno = telefonoAlumno;
	}

	public AlumnoDto(long idAlumno, String nombreAlumno, String apellidosAlumno, String dniAlumno,
			LocalDate fchNacimientoAlumno, String emailAlumno, int telefonoAlumno) {
		super();
		this.idAlumno = idAlumno;
		this.nombreAlumno = nombreAlumno;
		this.apellidosAlumno = apellidosAlumno;
		this.dniAlumno = dniAlumno;
		this.fchNacimientoAlumno = fchNacimientoAlumno;
		this.emailAlumno = emailAlumno;
		this.telefonoAlumno = telefonoAlumno;
	}

	public AlumnoDto() {
		super();
	}

	@Override
	public String toString() {
		
		String telefonoAlumnoString = Integer.toString(this.telefonoAlumno);
		String idAlumnoString = Long.toString(this.idAlumno);
		
		String objetoString="Id: ".concat(idAlumnoString).concat(" Nombre: ").concat(nombreAlumno).concat(" Apellidos: ").concat(apellidosAlumno).concat(" DNI: ").concat(dniAlumno).concat(" Fecha de nacimiento: ").concat(fechaNacimientoAlumnnoString).concat(" Email: ").concat(emailAlumno).concat(" Telefono: ").concat(telefonoAlumnoString);
	
		return objetoString;
	}
}
