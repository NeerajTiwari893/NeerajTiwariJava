package MethodPracticeStudy;

public class Nonstaticstudy {

	public static void main(String[] args) {
		// Non static method of zero parameter

		//create object 
		//classname object =new classname();
		Nonstaticstudy a=new Nonstaticstudy();
		a.div();
		//objectname.methodname();
		
		NonAnoStatic b=new NonAnoStatic(); // zero parameter
		b.test();
	}

	public void div() // non static method //zero parameter 
	{
		int a=30;
		int b=2;
		int div=a/2;
		System.out.println("Value of div is equal to : "+div);
		System.out.println("===========");
		System.out.println("Value of A+B+div is equal to :"+(a+b+div));
		System.out.println("Vlaue of multi is equal to : "+(a*b));
	}
	
}
