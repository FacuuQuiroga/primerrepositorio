package principal;

import java.io.FileNotFoundException;
import java.io.IOException;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int coso = 0;
		coso = +2;
	}

	public class TemperaturaNoValidaException extends Exception {
		public TemperaturaNoValidaException() {
			super(" La t e m p e r a t u r a no p u e d e se m e n o r q u e -273 oC ");
		}
	}

}
