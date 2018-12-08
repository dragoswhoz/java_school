package exercitii;

public class SumOfPrimes {

	public static void main(String[] args) {
		int number = 100;
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			if(isPrime(i)) {
				sum = sum + i;
			}
			
			
		}
		System.out.println("Suma numerelor prime de la 0 la " + number + " este: " + sum);
		
	}	
	
	public static boolean isPrime(int n) {
		if(n == 1) {
			return false;
		}
		
		for (int i = 2; i <= n/2; i++) {
			if(n % i == 0) {
				return false;
			}
		}
		return true;
		
	}
}
