package model;

public class PersonalDTO {
	private int cedula;
	private String nombre;
	private String apellido;
	private String genero;
	private String telefono;
	private String correo;
	private String  direccion;
	private String anoIngreso;
    private String tipoPersonal;
	
	
	public PersonalDTO(int cedula, String nombre, String apellido , String genero,
			String telefono, String correo, String direccion, String anoIgreso, String tipoPersonal) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
		this.telefono = telefono;
		this.correo = correo;
		this.direccion = direccion;
		this.anoIngreso = anoIgreso;
		this.tipoPersonal = tipoPersonal;
		
	}

	public int getCedula() {
		return cedula;
	}

	public void setCedula(int cedula) {
		this.cedula = cedula;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getAnoIngreso() {
		return anoIngreso;
	}

	public void setAnoIngreso(String anoIngreso) {
		this.anoIngreso = anoIngreso;
	}

	public String getTipoPersonal() {
		return tipoPersonal;
	}

	public void setTipoPersonal(String tipoPersonal) {
		this.tipoPersonal = tipoPersonal;
	} 
	



	
	

}
