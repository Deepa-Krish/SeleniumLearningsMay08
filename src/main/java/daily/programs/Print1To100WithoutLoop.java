package daily.programs;

public class Print1To100WithoutLoop {

	public static void main(String[] args) {
//	  printNum(1);
		printNum2(1,110);
	}
	//using recursion method PrintNum is calling itself again and again
//		public static void printNum(int n) {
//	    if(n<=100) {
//	    	System.out.println(n);
//	    	n++;
//	    	printNum(n);
//	    }
//		}
	
	public static void printNum2(int startNum,int endNum) {
		if (startNum<=endNum){
		System.out.println(startNum);
		startNum++;
		printNum2(startNum,endNum);
}
}
}