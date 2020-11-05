package exercise7;

import java.util.Scanner;

/*
	7.- Crear una función que reciba un número como parámetro e imprime un triángulo de números
	de la forma siguiente. Si el número leído es 4, imprimirá:
	1
	22
	333
	4444
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static void printNumberTree(int number) {

		int numberAux = 1;

		while (numberAux <= number) {
			String numberString = "";
			for (int i = 0; i < numberAux; i++) {
				numberString += Integer.toString(numberAux);
			}
			System.out.println(numberString);
			numberAux++;
		}

	}

	public static void main(String[] args) {
		try {
			System.out.println("Introduce a number: ");
			int number = reader.nextInt();

			printNumberTree(number);

		} finally {
			reader.close();
		}

	}

}
