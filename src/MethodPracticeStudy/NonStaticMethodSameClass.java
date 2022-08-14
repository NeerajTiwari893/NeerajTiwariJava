package MethodPracticeStudy;

public class NonStaticMethodSameClass {

	public static void main(String[] args) {
	
		//NONSTATIC METHOD WITH SAME CLASS 
		
		//CLASSNAME objectname = new classname();
		
		NonStaticMethodSameClass Test=new NonStaticMethodSameClass();
		
		Test.Collage();

		//NONSTATIC METHOD WITH diffent CLASS 
		
				//CLASSNAME objectname = new classname();
		
		NonStaticMetodAnotherClassStudy2 Result =new NonStaticMetodAnotherClassStudy2();
		
		Result.Test2();  //object.methodname();
		
	}


	public void Collage()   //non static regular method declr 

	{
		System.out.println("thIS IS CALLED AS METHOD");
		
	}
	
	
}
