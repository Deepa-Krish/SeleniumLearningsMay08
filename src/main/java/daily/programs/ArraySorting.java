package daily.programs;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		int [] str = new int[] {5, 7, 3, 9, 2};
		//System.out.println(str.length-1);
		int[] str2 = str;
		for (int i = 0; i <= str.length-1; i++) {
			for (int j = i+1; j <= str.length-1; j++) {
				if (str[i]<str[j]) {
				int temp = str[i];
				str[i] = str[j];
				str[j] = temp;	
				}	
			}
		System.out.println(str[i]);	}
		Arrays.sort(str2);
		for (int i = 0; i <=str2.length-1; i++) {
			System.out.println(str2[i]);		
		}
		
		System.out.println(str == str2); //Doubt ??
      }
}
	

	


