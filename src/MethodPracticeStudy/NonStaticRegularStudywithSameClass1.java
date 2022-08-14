package MethodPracticeStudy;

public class NonStaticRegularStudywithSameClass1 {

	public static void main(String[] args) {
		
		// we are creating object as per requirement
		// classname object=new classname();
		
		NonStaticRegularStudywithSameClass1 Score =new NonStaticRegularStudywithSameClass1();  //create object in main method 
		
		//object.methodname();
		
		Score.IPL();
		
		// NON Static method with Another class program run
		
		// we are creating object as per requirement
		// classname object=new classname();
		
		NonStaticRegularMethodAnotherClass Score1=new NonStaticRegularMethodAnotherClass();
		
		//object.methodname(); call another method in main method
		
		Score1.Maximum();
		
	
	
	}


		public void IPL()   //Non static regular method call with same class
		{
			System.out.println("Gujrat is most stong team in TATA ILP T20 Match");
			
		}
		
	
}
