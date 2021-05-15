package daily.programs;
import java.util.Scanner;
public class ReverseString {

	public static void main(String[] args) {
		System.out.println("Enter the Name or Words");
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		//String str = "Hello abc";
		for (int i = str.length()-1 ; i >= 0; i--) { 
			char str2 = str.charAt(i);
			 System.out.print(str2);
		}	 
		// StringBuffer way	 
		/*StringBuffer strnew = new StringBuffer(str);
		strnew.reverse();
		System.out.println(strnew);*/

	}
}