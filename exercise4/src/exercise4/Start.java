package exercise4;

import java.util.Scanner;

/*
	4.- Crear una función a la cual se le pasa dos números positivos (en caso de no serlo la función
	delvolverá -1. Se debe realizar el producto de uno por otro mediante sumas sucesivas.
	5 X 3 = 5 + 5 + 5 (mediante un bucle).
 */

public class Start {

	static Scanner reader = new Scanner(System.in);

	public static long functinMultiply(int number,int times) {
		
		long result = 0L;
		
		for(int i = 1; i <= times; i++) {
			result += number;
		}
		
		return result;
		
		
	}

	public static void main(String[] args) {
		try {
			System.out.println("Introduce a number: ");
			int number = reader.nextInt();
			
			System.out.println("Introduce the multiply: ");
			int numberMultiply = reader.nextInt();
			

			System.out.println(functinMultiply(number,numberMultiply));
			

		} finally {
			reader.close();
		}

	}

}