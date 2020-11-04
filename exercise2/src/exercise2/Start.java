package exercise2;

import java.util.Scanner;

/*
 	2.- Crear una función llamada capicúa, a la cual se le pasa un único parámetro de tipo entero, y
	devuelve un boolean determinando si lo es o no.
	
	1221: es capicúa
	234: no es capicúa
	Nota: un número es capicúa si se lee igual de derecha a izquierda y de viceversa.
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static boolean isCapicua(int number) {
		
		String numberString;
		String numberStringReversed;

		numberString = Integer.toString(number);
		
		numberStringReversed = new StringBuffer(numberString).reverse().toString(); 
		
		if (numberString.equals(numberStringReversed)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Introduce a number to check if is capicua:");
			int number = reader.nextInt();

			if (isCapicua(number)) {
				System.out.print(number + ": es capicúa");
			} else {
				System.out.print(number + ": no es capicúa");
			}

		} finally {
			reader.close();
		}

	}

}