package controlStatementStudy;

public class IfStudy {

	public static void main(String[] args) {
		// X& Y value greater than 20
		// Mark is greater then 40 then i am pass
		//Gender is M then  i am boy 
		//Im working then my salary is 2 lakh
		int x=22;
		int y=10;
		int mark=50;
		char Gender='M';
		int salary=5000;
		
		if (x+y>20) {
			
			System.out.println("Value of X+Y is greater then 20");
		}

		if (mark>40) {
			
			System.out.println("I am pass");
		}
		if (Gender=='M') {
			
			System.out.println("I am Boy");
		}
		if (salary<10000) {
			System.out.println("I am working in IT company");
		}
	}

}


