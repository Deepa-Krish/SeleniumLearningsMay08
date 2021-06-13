package parameters.prog;

import java.util.Scanner;

public class SampleProgram {
     
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

	     System.out.println("Enter the Name ?");
	     String s1 = sc.nextLine();
	     sc.close();

		System.out.println(s1);
	}

	}


