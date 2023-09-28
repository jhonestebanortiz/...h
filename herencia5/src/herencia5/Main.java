package herencia5;
import java.util.Scanner;
public class Main {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Creación de una instancia de Libro");
	        System.out.print("Título del libro: ");
	        String tituloLibro = scanner.nextLine();
	        System.out.print("Precio del libro: ");
	        float precioLibro = scanner.nextFloat();
	        System.out.print("Número de páginas: ");
	        int numPaginas = scanner.nextInt();
	        System.out.print("Año de publicación: ");
	        int anioPublicacion = scanner.nextInt();

	        libro libro = new libro(tituloLibro, precioLibro, numPaginas, anioPublicacion);

	        System.out.println("Creación de una instancia de Disco");
	        scanner.nextLine();  
	        System.out.print("Título del disco: ");
	        String tituloDisco = scanner.nextLine();
	        System.out.print("Precio del disco: ");
	        float precioDisco = scanner.nextFloat();
	        System.out.print("Duración en minutos: ");
	        float duracionMinutos = scanner.nextFloat();

	        disco disco = new disco(tituloDisco, precioDisco, duracionMinutos);

	        System.out.println("\nDatos del libro:");
	        libro.mostrar();

	        System.out.println("\nDatos del disco:");
	        disco.mostrar();
	    }
	}

