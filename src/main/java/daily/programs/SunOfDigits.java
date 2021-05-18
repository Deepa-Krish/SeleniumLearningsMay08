package daily.programs;

public class SunOfDigits {

	public static void main(String[] args) {
	     int input  = 123;
	     int sum   = 0;
	     while(input != 0) {
	    	 int q = input%10;
	    	 int r = input/10;
			 sum = sum + q;
			 input = r;
		}System.out.println(sum);

	}

}
