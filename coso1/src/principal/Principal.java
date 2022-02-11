package principal;

import java.time.LocalDate;

import entidades.LetraNifException;
import entidades.Nif;
import entidades.NifException;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Collection;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);/// IMPORTATE PAL TECLADO

		int anio = 1997;
		LocalDate horas = null;

		System.out.println(LocalDate.now());
		System.out.println(LocalTime.now());
		System.out.println(LocalDateTime.now());
		System.out.println(LocalDate.of(anio, Month.JULY, 1));

		horas = LocalDate.now();
		System.out.println("el dia es" + horas.getYear() + horas.getMonthValue() + horas.getDayOfMonth());

		int num = 58427904;
		char letra = 's';
		String coso = "58427904S";

		if (coso.length() != 1) {
			System.out.println("Uso: VerificaNif NIF");
			return;
		} else {
			try {
				Nif Nif = new Nif(coso);
				System.out.println("El NIF es correcto.");
			} catch (LetraNifException ex) {
				System.out.println("La letra del NIF es incorrecta");
			} catch (NifException ex) {
				System.out.println("Construcción de NIF incorrecta");
			} finally {
				System.out.println("Que tenga un buen día");
			}
		}
	}
}
