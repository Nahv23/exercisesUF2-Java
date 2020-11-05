package exercise5;

import java.util.Scanner;

/*
	5.- Crear una función que devuelva si un número entero positivo N que se le pasa como parámetro
	de entrada es primo o no (se va dividiendo por2, 3, 5, 7....... hasta N-1). Si ninguna de las divisiones
	es exacta y llegamos a una en la que el cociente es menor o igual que el divisor, el número es
	primo. El programa devuelve true o false.
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static boolean isPrime(int num) {

		if (num == 0 || num == 1 || num == 2 || num == 3)
			return true;
		if (num == 1)
			return false;
		if (num % 2 == 0 || num % 3 == 0 || num % 10 == 5)
			return false;

		long sqrtN = (long) Math.sqrt(num) + 1;
		for (long i = 7L; i <= sqrtN; i += 2) {
			if (num % (i) == 0)
				return false;
		}
		return true;

	}

	public static void main(String[] args) {

		int number;

		try {
			System.out.println("Introduce un numero");
			number = reader.nextInt();

			if (isPrime(number)) {
				System.out.println("El numero " + number + " es primo");
			} else {
				System.out.println("El numero " + number + " no es primo");
			}

		} finally {
			reader.close();
		}
	}
}
