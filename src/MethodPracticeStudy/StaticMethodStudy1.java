package MethodPracticeStudy;

public class StaticMethodStudy1 {

	public static void main(String[] args) {

		Velocity(); //call static regualar  method in same class in main method
		
		StaticMethodAnotherClassStudy.Testing();
	}

	public static void Velocity()  //static regular method declared with Same class 
	{
		System.out.println("Velocity is the best classed for Testing");
		
	}
	
	
}
