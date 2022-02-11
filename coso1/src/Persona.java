public class Persona implements java.io.Serializable {
// Esta clase debe ser Serializable para
// poder ser escrita en un stream de objetos
	private String nombre;
	private int edad;

	public Persona(String s, int i) {
		nombre = s;
		edad = i;
	}

	public String toString() {
		return nombre + ":" + edad;
	}
}