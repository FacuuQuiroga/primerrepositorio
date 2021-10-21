package principal;

import java.util.Scanner;
import entidades.Persona;
import entidades.Asignatura;
import entidades.Doctor;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado;/// IMPORTATE PAL TECLADO
		teclado = new Scanner(System.in);/// IMPORTANTE PAL TECLADO
		
		//PERSONA LUIS
		Persona luis, nico; //declaro persona luis
		luis  = new Persona(); //inicializao persona luis con el constructor
		nico = new Persona();
		
		luis.setId(44);
		String nombreLuis = "luis de blas";
		luis.setNombre(nombreLuis);
		luis.getEdad();
		
		String aux;
		aux = luis.getNombre();
		String asignaturaFavLuis = "matematicas";
		//luis.setAsignaturaFav(asignaturaFavLuis); // hay q verlo
		
		
		//System.out.println(luis.getAsignaturaFav());
		System.out.println("identificador de\t"+aux+ " es:\t" +luis.getId());

		//PERSONA FACU
		Persona facu = new Persona();//declaro e inicializo persona facu
		
		facu.setId(24);
		String nombreFacu = teclado.next();
		facu.setNombre(nombreFacu);
		System.out.println(facu); //to String

		
		
		
		
		
//		System.out.println("dame a numero");
//		int mientero = teclado.nextInt();
//		int total = mientero + 5;
//		System.out.println("si sumamo 5  lo q metas es igual a: "+ total );
//		
		
		//int valorInicialConseguido;
		//long idPersona;
		//double doble1  = 5,doble2 =2, doble3 = 3;
		//float miFloat = 0.55F;
		//char letra=0;  //un unico caracter, siempre usamos tipo string
		//int coso = 21;
		//boolean exito;
		//char a = 0;

		//String mensaje="holaquetal"; //cadena de caracteres entre "cadena" // ""->(cadena vacia)
		//System.out.println(mensaje + "sads\n"+"sadas");
		//System.out.println(doble1 + "\t "+ doble2);
		//System.out.printf("hola\t" + doble2 + doble3 +"\tbla\"bla\"bla\t" + "holisis");
		//System.out.println(coso++);
		//System.out.println(coso);
		//System.out.println(++coso);
	}

}


 