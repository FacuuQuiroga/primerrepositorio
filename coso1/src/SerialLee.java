import java.io.*;
import java.util.Date;

class SerialLee {
	public static void main(String arg[]) {
		try {
			// Un InputStream subyacente del cuál
			// leer los bytes
			FileInputStream f = new FileInputStream("prueba.dat");
			// El objeto deserializador
			ObjectInputStream ost = new ObjectInputStream(f);
			Persona persona = (Persona) ost.readObject();//hace un casting al tipo persona
			Date fecha = (Date) ost.readObject();
			int entero = ost.readInt();

			System.out.println(persona);
			System.out.println(fecha);
			System.out.println(entero);
			ost.close();
		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}
}