import java.io.*;

class SerialEscribe2 {
	public static void main(String arg[]) {
		try {
			FileOutputStream f = new FileOutputStream("prueba.dat");
			ObjectOutputStream ost = new ObjectOutputStream(f);
			Persona2 persona = new Persona2("Victor", 30);
			ost.writeObject(persona);
			ost.flush(); // vaciar el buffer
			ost.close();
		} catch (IOException e) {
			System.err.println(e);
		}
	}
}