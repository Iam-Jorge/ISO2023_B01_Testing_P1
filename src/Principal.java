import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.print("Apellidos: ");
		String apellidos = scanner.nextLine();
		
		System.out.print("Fecha de Naciemiento con formato (01/01/1990): ");
		String fecha_nacimiento = scanner.nextLine();
		
		System.out.print("Nacionalidad: ");
		String nacionalidad = scanner.nextLine();
		
		System.out.print("Titulación: ");
		String titulacion = scanner.nextLine();
		
		System.out.print("Número de teléfono (+34): ");
		int telefono = scanner.nextInt();

		System.out.print("Certificación de lengua inglesa (Sí/No): ");
		boolean cetIngles = scanner.nextBoolean();
		
		System.out.print("Correo eléctronico: ");
		String email = scanner.nextLine();
		
		scanner.close();
		
		Persona persona = new Persona(nombre, apellidos, fecha_nacimiento, nacionalidad, titulacion, cetIngles, telefono, email);
		System.out.println(persona.esEuropeo(persona));

	}

}
