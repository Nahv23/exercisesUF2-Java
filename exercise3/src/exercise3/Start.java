package exercise3;

import java.util.Scanner;

/*
	3.-Crear un programa que posea una función que calcule la potencia de un número elevado a otro.
	
	A la función se le pasarán dos números. El primero será la base y el segundo la potencia. La
	potencia tendrá que ser positiva, en caso de no serlo la función devolverá -1.
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static float calculateExponentiation(int base, int exponent) {
				
		if (exponent < 0) {
			return -1;
		} else {
			return (float) Math.pow(base, exponent);
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println("Introduce a base: ");
			int numberBase = reader.nextInt();
			
			System.out.println("Introduce the exponent: ");
			int numberExponent = reader.nextInt();

			System.out.print(calculateExponentiation(numberBase, numberExponent));

		} finally {
			reader.close();
		}

	}

}