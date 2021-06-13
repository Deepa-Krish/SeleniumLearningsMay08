package daily.programs;

public class ReverseWord {

	public static void main(String[] args) {
	String str = "Java Programming";
	String[] input = str.split(" ");
	String rev ="";
	
	System.out.println(input[1]);
	System.out.println(input.length);
	 for (int i = input.length-1; i>=0; i--) {
	   rev =input[i]+ " "; 
		System.out.print(rev);
		 
		
	}
	}
}


//https://www.tutorialspoint.com/reverse-words-in-a-given-string-in-java
//https://www.educative.io/edpresso/how-to-reverse-the-order-of-words-in-a-sentence