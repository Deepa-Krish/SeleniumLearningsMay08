package daily.programs;

public class GivenArrayIsSortedOrNot 
 {
	public static void main(String[] args) {
		int[] a1 = { 1,2,3,4,5};
		 System.out.println(isSorted(a1)); 
	}
		public static boolean isSorted(int [] a1) {
			for (int i = 0; i <= a1.length-1; i++)  //if given { it will not work. cosidering i and j condition has 1
				for (int j = i+1; j <= a1.length-1; j++) {
					if (a1[i] > a1[j]) // This can be (a1[i] > a1[i +1]) by commenting j loop
					{
						return false;	
						}			
				}	
		return true;			
		}
		}	




