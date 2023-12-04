
public class Persona implements Dominio {
	
	String nombre;
	String apellidos;
	String fecha_nacimiento;
	String nacionalidad;
	String titulacion;
	boolean certIngles;
	int telefono;
	String correo;
	
	public Persona(String nombre, String apellidos, String fecha_nacimiento, String nacionalidad, String titulacion,
			boolean certIngles, int telefono, String correo) {
		super();
		this.nombre = setNombre(nombre);
		this.apellidos = setApellidos(apellidos);
		this.fecha_nacimiento = setFecha_nacimiento(fecha_nacimiento);
		this.nacionalidad = setNacionalidad(nacionalidad);
		this.titulacion = setTitulacion(titulacion);
		this.certIngles = setCertIngles(certIngles);
		this.telefono = setTelefono(telefono);
		this.correo = setCorreo(correo);
	}

	public String getNombre() {
		return nombre;
	}

	public String setNombre(String nombre) {
		return this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String setApellidos(String apellidos) {
		return this.apellidos = apellidos;
	}

	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public String setFecha_nacimiento(String fecha_nacimiento) {
		return this.fecha_nacimiento = fecha_nacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String setNacionalidad(String nacionalidad) {
		return this.nacionalidad = nacionalidad;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public String setTitulacion(String titulacion) {
		return this.titulacion = titulacion;
	}

	public boolean getCertIngles() {
		return certIngles;
	}

	public boolean setCertIngles(boolean certIngles) {
		return this.certIngles = certIngles;
	}

	public int getTelefono() {
		return telefono;
	}

	public int setTelefono(int telefono) {
		return this.telefono = telefono;
	}

	public String getCorreo() {
		return correo;
	}

	public String setCorreo(String correo) {
		return this.correo = correo;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", nacionalidad=" + nacionalidad + ", titulacion=" + titulacion + ", certIngles=" + certIngles
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}

}
