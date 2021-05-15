package daily.programs;

public class CountCharacterOccurence {

	public static void main(String[] args) {
		String str = " test test tt";
		int count = 0;
		 char a2 = 't';
		
		for (int i = 0; i < str.length(); i++) {
			char a1 = str.charAt(i);
				if (a1 == a2) {
					count = count+1;		
				}
			} System.out.println("Character - "+a2+" = "+ count);				
	}	
		}
		
			
		
	



