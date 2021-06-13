package daily.programs;

public class ShiftZeroElementToRightSide {
	//shift all zero element to right side of the array input:[010203] o/p:[123000]
  //https://webrewrite.com/move-all-zeroes-to-end-of-array-java-code/
	public static void main(String[] args) {
		int [] input = {0,1,0,2,0,3};
		int count = 0;
         for (int i = 0; i <= input.length-1; i++) {
        	  if (input[i] != 0) {
				input[count++] =input[i];  //override the previous value
			}
				 }
			while(count < input.length ) {
				input[count++] = 0;	
			}
			
		for (int j = 0; j <= input.length-1; j++) {
			System.out.print(input[j]);
		}
	}

}
