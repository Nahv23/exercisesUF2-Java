package exercise6;

import java.util.Scanner;

/*
	6.- Dado un n�mero entero positivo N, escribe una funci�n que determine cu�ntos d�gitos se
	necesitan para escribir el valor num�rico N. Por ejemplo, 99 necesita 2 d�gitos, 115necesita 3, para
	1000 la salida es 4. El programa devolver� el n�mero de d�gitos.
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static int numberOfDigits(float number) {
		
		int digits = 0;
		int temp = 1;
		while (temp <= number) {
			digits++;
		    temp *= 10;
		}
		
		return digits;
	}

	public static void main(String[] args) {
		try {
			System.out.println("Introduce a number: ");
			int number = reader.nextInt();
			
	

			System.out.println(numberOfDigits(number));
			

		} finally {
			reader.close();
		}

	}

}

