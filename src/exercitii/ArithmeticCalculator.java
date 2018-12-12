package exercitii;
import java.util.Scanner;

public class ArithmeticCalculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduceti primul numar");
		double a;
		double b;
		char operator;
		double answer;
		a = sc.nextDouble();
		
		System.out.println("Introduceti ce operatie doriti sa efectuati pentru cele doua numere: +, -, /, *, %");
		
		
		while(true) {
			operator = sc.next().charAt(0);
			
			if(operator != '+' && operator != '-' && operator != '*'  && operator != '/' && operator != '%') {
				System.out.println("Operatorul introdus nu este corect\n"
						+ "Introduceti ce operatie doriti sa efectuati pentru cele doua numere: +, -, /, *, %");
				continue;
			} 
			break;
			
		}
		System.out.println("Introduceti al doilea numar");
		b = sc.nextDouble();
		
		
		
		switch(operator) {
		
		case '+' : 
			answer = a + b;
			System.out.println(a + " + " + b + " = " + answer);
			break;
		
		case '-' : 
			answer = a - b;
			System.out.println(a + " - " + b + " = " + answer);
			break;
			
		case '*' : 
			answer = a * b;
			System.out.println(a + " * " + b + " = " + answer);
			break;
			
		case '/' : 
			answer = a / b;
			System.out.println(a + " / " + b + " = " + answer);
			break;
			
		case '%' : 
			answer = a % b;
			System.out.println(a + " % " + b + " = " + answer);
			break;
			
		}

		sc.close();
	
	
	}

}
