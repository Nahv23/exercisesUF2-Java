package exercise3;

import java.util.Scanner;

/*
	3.-Crear un programa que posea una funci�n que calcule la potencia de un n�mero elevado a otro.
	
	A la funci�n se le pasar�n dos n�meros. El primero ser� la base y el segundo la potencia. La
	potencia tendr� que ser positiva, en caso de no serlo la funci�n devolver� -1.
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