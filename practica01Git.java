package Tema7;

import java.util.Scanner;

public class practica01Git {
	
	/**
	 * @author Marcos Aboy Josa
	 * @since 1.8
	 * 
	 * Método para comprobar que el dato que nos ha introducido es un número
	 * 
	 * @param sc Objeto de tipo scanner 
	 * @param instruccion Dato introducido por pantalla
	 * @return Devuelve true si el dato que nos han introducido es un número y false si no lo es
	 */
	public static int PideNumero(Scanner sc, String instruccion) {
		boolean fin = false;
		int n = 0;
		do {
			try {
				System.out.println(instruccion);
				String s = sc.nextLine();
				n = Integer.parseInt(s);
				fin = true;
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (!fin);
		return n;
	}

}
