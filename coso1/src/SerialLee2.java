import java.io.*;

class SerialLee2 {
	public static void main(String arg[]) {
		try {
			FileInputStream f = new FileInputStream("prueba.dat");
			ObjectInputStream ost = new ObjectInputStream(f);
			Persona2 persona = (Persona2) ost.readObject();
			System.out.println(persona);
			ost.close();
		} catch (IOException e) {
			System.err.println(e);
		} catch (ClassNotFoundException e) {
			System.err.println(e);
		}
	}
}