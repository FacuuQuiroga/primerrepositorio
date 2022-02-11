import java.util.Date;
import java.io.*;

public class Persona2 implements java.io.Serializable {
	private String nombre;
	private int edad;

	public Persona2(String s, int i) {
		nombre = s;
		edad = i;
	}

	public String toString() {
		return nombre + ":" + edad;
	}

	private void writeObject(java.io.ObjectOutputStream out) throws IOException {
		// Escribir los atributos por defecto
		out.defaultWriteObject();
		// A¤adir la fecah de escritura
		out.writeObject(new Date());
	}

	private void readObject(java.io.ObjectInputStream in) throws IOException, ClassNotFoundException {
		// Leer los atributos por defecto
		in.defaultReadObject();
		// Leer la fecha guardada
		Date fecha = (Date) in.readObject();
		System.out.println("Objecto grabado en fecha: " + fecha);
	}
}