import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public interface Dominio {

	static boolean mayorEdad(Persona persona) {
		boolean esMayor = false;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(persona.fecha_nacimiento, ahora);

		if (periodo.getYears() >= 18) {
			esMayor = true;
		}
		return esMayor;
	}

	static boolean esEuropeo(Persona persona) {

		boolean esEuropep = false;
		List<String> listaNacionalidades = Arrays.asList("Alemania", "Bélgica", "Croacia", "Dinamarca", "España",
				"Francia", "Irlanda", "Letonia", "Luxemburgo", "Países Bajos", "Suecia", "Bulgaria", "Eslovaquia",
				"Estonia", "Grecia", "Malta", "Polonia", "República Checa", "Austria", "Chipre", "Eslovenia",
				"Finlandia", "Hungría", "Italia", "Lituania", "Portugal", "Rumanía");

		if (listaNacionalidades.contains(persona.nacionalidad)) {
			esEuropep = true;
		}

		return esEuropep;
	}

	static boolean comprobarTitulacion(Persona persona) {
		boolean matricularse = false;
		List<String> listaTitulaciones = Arrays.asList("Máster", "Doctorado");

		if (listaTitulaciones.contains(persona.titulacion)) {
			matricularse = true;
		}

		return matricularse;
	}

	public static boolean validarCertIngles(String certInglesInput) {
		String respuesta = certInglesInput.toLowerCase().trim();

		if (respuesta.equals("sí") || respuesta.equals("si") || respuesta.equals("s")) {
			return true;
		} else if (respuesta.equals("no") || respuesta.equals("n")) {
			return false;
		} else {
			throw new IllegalArgumentException("Opción inválida para certificación de inglés: " + certInglesInput);
		}
	}

	static LocalDate validateFechaNacimiento(String fechaNacimientoInput) {
		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			return LocalDate.parse(fechaNacimientoInput, formatter);
		} catch (Exception e) {
			throw new IllegalArgumentException("Formato de fecha de nacimiento inválido: " + fechaNacimientoInput);
		}
	}

}
