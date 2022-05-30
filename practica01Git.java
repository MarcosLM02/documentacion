package Tema7;

import java.util.Scanner;

/**
 * @author Marcos Aboy Josa
 * @since 1.8
 */
public class practica01Git {
	
	/**
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
	
	/**
	 * Método para comprobar que el dato que nos ha introducido es un número decimal
	 * 
	 * @param sc Objeto de tipo scanner 
	 * @param instruccion Dato introducido por pantalla
	 * @return Devuelve true si el dato que nos han introducido es un número decimal y false si no lo es
	 */
	public static double PideNumeroD(Scanner sc, String instruccion) {
		boolean fin = false;
		double n = 0;
		do {
			try {
				System.out.println(instruccion);
				String s = sc.nextLine();
				n = Double.parseDouble(s);
				fin = true;
			} catch (Exception e) {
				System.out.println("Formato incorrecto");
			}
		} while (!fin);
		return n;
	}

}
