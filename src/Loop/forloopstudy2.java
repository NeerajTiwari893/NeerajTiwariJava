package Loop;

public class forloopstudy2 {

	
	public static void main(String[] args) {
		//initilisation 
		//condition
		//updation
		
	// table for 15 
		System.out.println("Table of 15");// without doing seperate initialisation 
	//	for (int i = 0; i < args.length; i++) {
	
		for (int i =15; i <=150; i=i+15) { // incremental value of 15 
			System.out.println(" "+i);
		}
		//decreasing order for table 15
	
		System.out.println("===========");
		System.out.println("Table of 15");
		for (int a =150; a>=15; a=a-15) { //
			System.out.println(a);
		}
		
	for (char x ='A'; x <='Z'; x++) { // alphabat from A to Z 
		System.out.print(" "+x);
	}
		System.out.println(" ");
		for (char b = 'Z'; b>='A'; b--) {
			System.out.print(" "+b);
		}
		
		
		System.out.println("===========");
		 // 2*1=2 -- 
		int y=2; // table of 2 // new veriable declare //y*c=y*c ==2*1=2
		for (int c =1; c<=10; c++) {
			System.out.println(y+"*"+c+"="+y*c); // 2*1=2
			//2*1=2*1 ==2
			// 2*2=2*2 =4 
			//2*3=2*3=4=6
		}
		System.out.println("===========");
	// decreasing order of table 2 
		int z=2; //default variable 
		for (int i =10; i>=1; i--) {
			System.out.println(z+"*"+i+"="+z*i);
		}
	}

}
