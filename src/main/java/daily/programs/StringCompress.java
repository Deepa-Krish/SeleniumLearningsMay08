package daily.programs;

public class StringCompress {
	
	public static String compression(String str) {	
		String str1 = str.charAt(0)+"";
			int count = 1;
			for (int i = 1; i < str.length(); i++) {
				char currentvalue = str.charAt(i);
				char previousvalue = str.charAt(i-1);
				if (currentvalue == previousvalue) {
					count++;
					}
				else {
					if(count>1) {
						str1 += count;
						count = 1;
					}
					str1 += currentvalue;
				}	  
			}
			    if(count>1) {
			    str1 += count;
			   count = 1;
		                      }
			return str1;	
		}
	
	public static void main(String[] args) {
		String str = "aaaabbbccddd";
		System.out.println(compression(str));
		}
	
}

		
	
	


