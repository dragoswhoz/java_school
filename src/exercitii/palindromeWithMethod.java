package exercitii;

import java.util.Scanner;

public class palindromeWithMethod {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar de cel putin doua cifre de la tastatura");

		while (true) {

			if (sc.hasNextInt()) {
				int n = sc.nextInt();
				if (n / 10 == 0) {   // verificam daca numarul are cel putin doua cifre
					System.out.println("introduceti un numar din cel putin doua cifre");
				} else {

					if (isPalindrome(n)) {
						System.out.println("Numarul introdus este palindrom");
					} else {
						System.out.println("Numarul introdus nu este palindrom");
						break;
					}
				}
			} else {

				System.out.println("Introduceti un numar valid");
				sc.nextLine();
			}
		}

		sc.close();
	}

	private static boolean isPalindrome(int n) {
		int inverseN = 0;
		int tempN = n;

		while (tempN != 0) {
			inverseN = tempN % 10 + inverseN * 10;
			tempN = tempN / 10;
		}
		if (n == inverseN) {
			return true;
		} else {
			return false;

		}
	}

}
