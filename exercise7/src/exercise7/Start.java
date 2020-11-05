package exercise7;

import java.util.Scanner;

/*
	7.- Crear una funci�n que reciba un n�mero como par�metro e imprime un tri�ngulo de n�meros
	de la forma siguiente. Si el n�mero le�do es 4, imprimir�:
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
