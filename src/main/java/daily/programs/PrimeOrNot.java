package daily.programs;

public class PrimeOrNot {

	public static void main(String[] args) {
		int input = 9;
		int count = 0;
		for (int i = 1; i <= input; i++) {
			if (input%i == 0) {
				count = count + 1;
		}
		 }
		if (count == 2) {
				System.out.println("Number"+ " "+input+" "+"is a prime" );
			}
			else {
				System.out.println("Number"+ " "+input+" "+"is NOT prime" );
			}
	}
}
