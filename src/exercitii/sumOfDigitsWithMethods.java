package exercitii;

import java.util.Scanner;

public class sumOfDigitsWithMethods {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar de la tastatura");

		while (true) {
			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				System.out.println("Suma cifrelor numarului " + n + " este: " + calculateSumOfDigits(n));
				break;
			} else {
				System.out.println("Introduceti un numar valid");
				sc.nextLine();
			}

		}
		sc.close();

	}

	public static int calculateSumOfDigits(int n) {
		int sum = 0;
		int digit = 0;
		while (n != 0) {
			digit = n % 10;
			sum = sum + digit;
			n = n / 10;
		}
		return sum;
	}

}
