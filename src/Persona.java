import java.time.LocalDate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Persona implements Dominio {

	String nombre;
	String apellidos;
	LocalDate fecha_nacimiento;
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
		this.fecha_nacimiento = setFechaNacimiento(fecha_nacimiento);
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

	public LocalDate getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public LocalDate setFechaNacimiento(String fechaNacimiento) {
		this.fecha_nacimiento = Dominio.validateFechaNacimiento(fechaNacimiento);
		return this.fecha_nacimiento;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public String setNacionalidad(String nacionalidad) {
		return nacionalidad;
	}

	public String getTitulacion() {
		return titulacion;
	}

	public String setTitulacion(String titulacion) {
		if (titulacion.toLowerCase().trim().equals("Máster")) {
			return "Máster";
		} else if (titulacion.toLowerCase().trim().equals("Doctorado")) {
			return "Doctorado";
		} else  {
			return "Otros";
		}
	}

	public boolean getCertIngles() {
		return certIngles;
	}

	public boolean setCertIngles(boolean certIngles) {
		return certIngles;
	}

	public int getTelefono() {
		return telefono;
	}

	public int setTelefono(int telefono) {
		if (telefono > 0 && String.valueOf(telefono).length() == 9) {
			this.telefono = telefono;
			return telefono;
		} else {
			throw new IllegalArgumentException("Número de teléfono no válido: " + telefono);
		}
	}

	public String getCorreo() {
		return correo;
	}

	public String setCorreo(String correo) {

		String EMAIL_PATTERN = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

		Pattern pattern = Pattern.compile(EMAIL_PATTERN);
		Matcher matcher = pattern.matcher(correo);
		if (matcher.matches()) {
			return correo;
		} else {
			throw new IllegalArgumentException("El formato de su corre: " + correo + " es incorrecto.");
		}
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", fecha_nacimiento=" + fecha_nacimiento
				+ ", nacionalidad=" + nacionalidad + ", titulacion=" + titulacion + ", certIngles=" + certIngles
				+ ", telefono=" + telefono + ", correo=" + correo + "]";
	}

}
