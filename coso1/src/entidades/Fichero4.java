package entidades;

import java.io.*;

class Fichero4 {
	public static void main(String[] args) {
		BufferedReader teclado;
		InputStreamReader inStream;
		PrintWriter pantalla;
		String nombreFichero, posición, b;
		RandomAccessFile fichero;
		inStream = new InputStreamReader(System.in);
		teclado = new BufferedReader(inStream);
		File f;
		long punteroF;
		try {
			// PrintWriter con autoflush a true
			pantalla = new PrintWriter(System.out, true);
			pantalla.println("Nombre de fichero:");
			nombreFichero = teclado.readLine();
			f = new File(nombreFichero);
			// apertura del fichero en modo lectura/escrit.
			fichero = new RandomAccessFile(f, "rw");
			pantalla.println("^Z para terminar");
			pantalla.println("byte a examinar:");
			while ((posición = teclado.readLine()) != null) {
				try {
					// buscar la posición en el fichero.
					// Integer.parseInt() obtiene int a partir
					// de un String
					fichero.seek(Integer.parseInt(posición));
					// obtener el puntero del fichero
					punteroF = fichero.getFilePointer();
					// leer y mostrar el byte en la posición
					pantalla.println("Valor del byte = " + fichero.readByte());
					pantalla.println("Nuevo valor del byte:");
					b = teclado.readLine();
					// posicionar el puntero del fichero en
					// el lugar guardado anteriormente
					fichero.seek(punteroF);
					// escribir el nuevo valor del byte
					fichero.writeByte(Integer.parseInt(b));
				} catch (IOException e) {
					System.err.println("No existe ese byte.");
				} catch (NumberFormatException e) {
					System.err.println("error num.");
				}
				pantalla.println("byte a examinar:");
			}
			teclado.close();
			pantalla.close();
			fichero.close();
		} catch (IOException e) {
			System.err.println("Error de E/S");
		}
	}
}