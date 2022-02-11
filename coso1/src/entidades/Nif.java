package entidades;

public class Nif {
	int dni;
	char letra;
	static final char tabla[] = { 'T', 'R', 'W', 'A', 'G', 'M', 'Y', 'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z', 'S', 'Q',
			'V', 'H', 'L', 'C', 'K', 'E' };

	public Nif(int ndni, char nletra) throws NifException {
		// debido a la cláusula throws, este método es capaz
		// de generar excepciones de la clase NifException
		if (Character.toUpperCase(nletra) == tabla[ndni % 23]) {
			// si la letra es correcta, almacenarla en el atributo
			dni = ndni;
			letra = Character.toUpperCase(nletra);
		} else
			// si la letra es incorrecta, generar una excepción
			throw new LetraNifException("Letra de NIF incorrecta");

	}

	public Nif(int ndni) {
		dni = ndni;
		letra = tabla[dni % 23];
	}

	public Nif(String sNif) throws NifException, LetraNifException {
		// debido a la cláusula throws, este método es capaz
		// de generar excepciones de la clase NifException y
		// de la clase LetraNifException, aunque en realidad
		// sería suficiente con NifException, ya que la clase
		// LetraNifException es una subclase de ésta.
		char letraAux;
		StringBuffer sNumeros = new StringBuffer();
		int i, ndni;
		for (i = 0; i < sNif.length(); i++) {
			if ("1234567890".indexOf(sNif.charAt(i)) != -1) {
				sNumeros.append(sNif.charAt(i));
			}
		}
		try {
			dni = Integer.parseInt(sNumeros.toString());
			letraAux = Character.toUpperCase(sNif.charAt(sNif.length() - 1));
		} catch (Exception ex) {
			// este bloque catch intercepta cualquier tipo de
			// excepción, incluso NumberFormatException
			throw new NifException("NIF incorrecto");
		}
		letra = tabla[dni % 23];
		if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(letraAux) != -1) {
			// es una letra correcta
			if (letraAux != letra) {
				// pero no la adecuada para el NIF
				throw new LetraNifException("Letra de NIF incorrecta");
			}
		} else
			letra = tabla[dni % 23];
	}

	public char obtenerLetra() {
		return letra;
	}

	public int obtenerDni() {
		return dni;
	}

	public String toString() {
		// redefinición del método toString() para que devuelva
		// un valor más significativo.
		return (String.valueOf(dni) + String.valueOf(letra));
	}

	public String toStringConFormato() {
		String sAux = String.valueOf(dni);
		StringBuffer s = new StringBuffer();
		int i;
		for (i = sAux.length() - 1; i > 2; i -= 3) {
			s.insert(0, sAux.substring(i - 2, i + 1));
			s.insert(0, ".");
		}
		s.insert(0, sAux.substring(0, i + 1));
		s.append('-');
		s.append(letra);
		return (s.toString());
	}

	static char letraNif(int ndni) {
		return tabla[ndni % 23];
	}

	static char letraNif(String sDni) throws NifException {
		Nif j = new Nif(sDni);
		return j.obtenerLetra();
	}
}

 class NifException extends Exception {
	public NifException() {
		super();
	}

	public NifException(String s) {
		super(s);
	}
}

class LetraNifException extends NifException {
	public LetraNifException() {
		super();
	}

	public LetraNifException(String s) {
		super(s);
	}
}
