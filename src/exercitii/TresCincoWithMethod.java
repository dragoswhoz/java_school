package exercitii;

public class TresCincoWithMethod {

	public static void main(String[] args) {
		tresCinco(100);
	}

	private static void tresCinco(int number) {
		for(int i = 1; i <= number; i++) {
			if(i % 3 == 0 && i % 5 == 0) {
				System.out.println(i + " TresCinco");
			}else if(i % 3 == 0) {
				System.out.println(i + " Tres");
			}else if(i % 5 == 0) {
				System.out.println(i + " Cinco");
			}else {
				System.out.println(i);
			}
		}
	}

}
