import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;

public interface Dominio {
	
	public default boolean mayorEdad(Persona persona) {

		/* boolean esMayor = false;
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate ahora = LocalDate.now();
		Period periodo = Period.between(persona.fecha_nacimiento, ahora);
		
		if (periodo.getYears() >= 18) {
			esMayor = true;
		}
		*/
		return false;
	}
	
	public default boolean esEuropeo(Persona persona) {
		
		boolean esEuropep = false;
		List<String> listaNacionalidades = Arrays.asList("Alemania", "Bélgica", "Croacia", "Dinamarca", "España", "Francia", "Irlanda", "Letonia", 
				"Luxemburgo", "Países Bajos", "Suecia", "Bulgaria", "Eslovaquia", "Estonia", "Grecia", "Malta", "Polonia", "República Checa", 
				"Austria", "Chipre", "Eslovenia", "Finlandia", "Hungría", "Italia", "Lituania", "Portugal", "Rumanía");

		if (listaNacionalidades.contains(persona.nacionalidad)) {
			esEuropep = true;
		}
		
		return esEuropep;
	}
	
	public default boolean comprobarTitulacion(Persona persona) {
		
		boolean matricularse = false;
		List<String> listaTitulaciones = Arrays.asList("Máster", "Doctorado");

		if (listaTitulaciones.contains(persona.nacionalidad)) {
			matricularse = true;
		}
		
		return matricularse;
	}
	
}
