package Loop;

public class DoWhileStudy2 {

	public static void main(String[] args) {
		// initillise 
		//condition 
		//updatation
		
		int i=1;
		do {
			System.out.println(i);
			i++;
		} while (i<=20);
		
		System.out.println("=============");
		int a=20;
		do {
			System.out.println(a);
			a--;
		} while (a>=1); //bolean condintion 
		
		
		
		int x=1;
		int y=1;
		do {
			System.out.println(x+"*"+y+"="+x*y);
			y++;    //x+"*"+y+"="+x*y) ==x*y=X*y
		} while (y<=20);
		
	}
	
}
