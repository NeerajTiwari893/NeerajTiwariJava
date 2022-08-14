package Loop;

public class whilesStudy {

	public static void main(String[] args) {
		// in while loop initialisation done outside of while loop 
	
		int a=2;// initilisation 
		
		while (a<=20) { // while loop condition
			System.out.println(a); // printing statement 
			a=a+2; // updatation 
		}
		System.out.println("===============");
		int i=1;
		while (i<=100) {
			System.out.print(" "+i);
			i++;
			if (i%10==0) //addition condition if use for count
				 System.out.println();
	
		}
		 System.out.println();
		int b=20;
		while (b>=2) {
			System.out.println(b);
			b=b-2;
		}
		
		int x=2;
		int y=1;
		while (y<=10) {
			System.out.println(x+"*"+y+"="+x*y);
			y++;
		}
		
	}
	
	

}
