import java.io.*;
import java.util.Date;

class SerialEscribe {
	public static void main(String arg[]) {
		try {
			// Un OutputStream subyacente sobre el que
			// escribir los bytes
			FileOutputStream f = new FileOutputStream("prueba.dat");
			// El objeto serializador
			ObjectOutputStream ost = new ObjectOutputStream(f);
			Persona persona = new Persona("Victor", 30);
			Date fecha = new Date();
			ost.writeObject(persona);
			ost.writeObject(fecha);
			ost.writeInt(13);
			ost.flush(); // vaciar el buffer
			ost.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}