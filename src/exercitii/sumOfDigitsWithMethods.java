package exercitii;

import java.util.Scanner;

public class sumOfDigitsWithMethods {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti un numar de la tastatura");
		
		while(true) {
			if(sc.hasNextInt()) {
				
				int n = sc.nextInt();
				int temp = n;
				int digit = 0;
				int sum = 0;
				
				while(temp != 0) {
					digit = temp % 10;
					sum = sum + digit;
					temp = temp / 10;
				}
				
				System.out.println("Suma cifrelor numarului " + n + " este: " + sum);
				
				break;
				
			}else {
				System.out.println("Introduceti un numar valid");
				sc.nextLine();
			}
			
		}
		sc.close();
		

	}

}
