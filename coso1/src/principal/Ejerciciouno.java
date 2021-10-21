package principal;
import java.util.Scanner;
public class Ejerciciouno {

	public static void main(String[] args) {
		Scanner teclado;
		teclado = new  Scanner(System.in);
		
		System.out.println("introduzca un enteros");
		int entero = teclado.nextInt();
		System.out.println("mi variable entero es:" + entero );
		
		teclado = new  Scanner(System.in);

		System.out.println("introduzca una cadena de caracteres");
		String cadenaDeCaracteres = teclado.nextLine();
		System.out.println("mi variable cadena de caracteres es: " + cadenaDeCaracteres );

		teclado = new  Scanner(System.in);

		System.out.println("introduzca un caracter");
		char caracter = teclado.nextLine().charAt(0);
		System.out.println("mi variable  caracter es: " + caracter );

		teclado = new  Scanner(System.in);

		System.out.println("introduzca un double");
		double doble = teclado.nextDouble();
		System.out.println("mi variable double es " + doble );

		teclado = new  Scanner(System.in); // hay que copiarla pq la variable teclado colapsa y hace cualquier cosa

		System.out.println("introduzca una booleano (true o false)");
		boolean booleano = teclado.nextBoolean();
		System.out.println("mi variable booleano es: " + booleano );
		
		
	}

}
