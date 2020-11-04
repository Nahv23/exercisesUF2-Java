package exercise1;

import java.util.Scanner;

/*
 	1.- Crear una funci�n llamada factorial a la cual se le pasa un �nico par�metro llamado numero de
	tipo entero. La funci�n devuelve el factorial de ese n�mero. En caso que el par�metro sea 0 o
	inferior devuelve un -1.
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static boolean isBiggerThan0(int number) {
		if (number <= 0)
			return false;
		else
			return true;
	}

	public static double factorial(int number) {
		
		
		if (number > 0) {
			double resultFactorial = 1D;
			for (int i = number; i > 0; i--) {
				resultFactorial = resultFactorial * i;
			}
			return resultFactorial;
		}
		else
			return -1;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Introduce a number to calculate its factorial");
			int number = reader.nextInt();

			System.out.println("The solution is: " + factorial(number));				
			
			

		} finally {
			reader.close();
		}

	}

}
