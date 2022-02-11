package Principal;

public class Main {

	public static void main(String[] args) {
		// Ejemplos de manejos de cadenas de caracteres (String)
		String cadena1, cadena2;
		cadena1 = "cadena de caracteres 1    ";
		System.out.println(cadena1);
		//Los métodos de la clase String NO modifican el valor de la variable		
		cadena1.charAt(0);
		cadena1.contains("cara");
		cadena1.indexOf('n');
		cadena1.length();
		cadena2 = cadena1.concat(" concatenada a esta");
		cadena1.endsWith("0");
		cadena1.startsWith("B");	
		cadena1.isEmpty();
		cadena1.replace('a', 'A');
//		String[] arrayDePalabras = cadena1.split(" ");
//		for(String s: arrayDePalabras) {
//			System.out.println(s+", ");
//		}
		System.out.println("cadena1="+cadena1);
		String subcadena = cadena1.substring(1, 5);
		System.out.println("subcadena="+subcadena);
		cadena1.toLowerCase();
		cadena1.toUpperCase();
		String cadeanaTrim = cadena1.trim();
		System.out.println("cadeanaTrim="+cadeanaTrim);
		System.out.println("cadena1="+cadena1);
		String entero = String.valueOf(2353.621);
		
		//MANEJO DE StringBuilder
		StringBuffer sb1;
		StringBuilder sbuilder;
		//Es necesario SIEMPRE inicializar con algun constructor de la clase StringBuilder
		StringBuilder s1 = new StringBuilder("hola");
		StringBuilder s2 = new StringBuilder(subcadena);
		StringBuilder s3 = new StringBuilder(5);
		StringBuilder s4 = new StringBuilder("dos");
		
		System.out.println("cap_s3="+ s3.capacity());
		System.out.println("len_s3="+ s3.length());
		System.out.println("cap_s4="+ s4.capacity());
		System.out.println("len_s4="+ s4.length());
		
		//s1 = "hola";  ///<--- ESTO sería incorrecto
		System.out.println("s1="+s1);
		s1.append(" y adios");
		System.out.println("s1="+s1);
		s1.append(44);
		System.out.println("s1="+s1);
		System.out.println("s1.capacity="+s1.capacity());
		s1.reverse();
		System.out.println("s1="+s1);
		
		s1.setCharAt(0,'@');
		s1.setCharAt(1,'@');
		s1.setCharAt(s1.length()-1,'X');
		System.out.println("s1="+s1);
		
		System.out.println("s2="+s2);
		s2.insert(2, "AÑADIR");
		System.out.println("s2="+s2);
		s2.append("DESPUES");
		System.out.println("s2="+s2);
		s2.delete(3, 5);
		s2.deleteCharAt(0);
		System.out.println("s2="+s2);
		
		s2.replace(1, 5, cadeanaTrim);
		System.out.println("s2="+s2);
		
	}

}
