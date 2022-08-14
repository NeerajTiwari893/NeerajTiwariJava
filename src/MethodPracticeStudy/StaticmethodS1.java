package MethodPracticeStudy;

public class StaticmethodS1 {

	public static void main(String[] args) {
		// create static method in the class and calling in the same class

		add();
		Staticanoth1.sub();
		
	}
	
	public static void add()  // static method calling in same class //methodname
	{
		int a=20;
	int b=40;
		int sum=a+b+200;
		System.out.println("Value of sum is :"+sum);
		int sub=a-b-100;
		System.out.println("value of sub is : "+sub);
		System.out.println("========");
		System.out.println("Value of A+B+sum is equal to :"+(a+b+sum));
		System.out.println("Value of A-B-sub is equal to :"+(a-b-sub));
	}
	
	
}
