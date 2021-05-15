package daily.programs;

public class ReverseGivenInteger {

	public static void main(String[] args) {
		int input = 123456;
		int rem = 0, rev = 0;
		while (input != 0)
		{
			rem = input % 10;
			rev = rev * 10 + rem ;
			input = input / 10;	
		System.out.println(rev);
		}
	}
}

