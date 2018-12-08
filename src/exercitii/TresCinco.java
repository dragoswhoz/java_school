package exercitii;

public class TresCinco {

	public static void main(String[] args) {
		int number = 100;
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
