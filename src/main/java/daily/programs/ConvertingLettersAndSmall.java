package daily.programs;

public class ConvertingLettersAndSmall {

	public static void main(String[] args) {
		String str = "aJaVa";
		StringBuffer originalstr = new StringBuffer(str);
		for (int i = 0; i <=str.length()-1; i++) {
			if(Character.isLowerCase(str.charAt(i))) {
				 originalstr.setCharAt(i, Character.toUpperCase(str.charAt(i)));
			}
			else {
				if (Character.isUpperCase(str.charAt(i))) {
					originalstr.setCharAt(i, Character.toLowerCase(str.charAt(i)));
					
				}
			}
			
		}	System.out.println(originalstr);
	}
}
