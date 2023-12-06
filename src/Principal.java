import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();

		System.out.print("Apellidos: ");
		String apellidos = scanner.nextLine();

		System.out.print("Fecha de Nacimiento con formato (dd/MM/yyyy): ");
		String fecha_nacimiento = scanner.nextLine();

		System.out.print("Nacionalidad (nombre del país de origen): ");
		String nacionalidad = scanner.nextLine();

		System.out.print("Titulación: ");
		String titulacion = scanner.nextLine();

		System.out.print("Número de teléfono: ");
		int telefono = scanner.nextInt();
		scanner.nextLine();

		System.out.print("Certificación de lengua inglesa (Sí/No): ");
		String certInglesInput = scanner.nextLine();
		boolean certIngles = Dominio.validarCertIngles(certInglesInput);

		System.out.print("Correo electrónico: ");
		String email = scanner.nextLine();

		scanner.close();

		Persona persona = new Persona(nombre, apellidos, fecha_nacimiento, nacionalidad, titulacion, certIngles,
				telefono, email);
		System.out.println(persona);
		System.out.println("Mayor de edad: " + Dominio.mayorEdad(persona));
		System.out.println("Es europeo: " + Dominio.esEuropeo(persona));
		System.out.println("Puede matricularse: " + Dominio.comprobarTitulacion(persona));
	}
}