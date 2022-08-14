package AccessSpecifiers;

public class AccessSpefiStudy {

	
	public static void main(String[] args) {
	
		AccessSpefiStudy A=new AccessSpefiStudy();
		A.test(); // Public -range of puvlic is with Project 
		A.test1();// Default -Range of default is withing Package
A.test2(); //Private - Range of private is Within same class 
test3();
test4();

	}
	public void test() {   // non static 
	System.out.println("Public Specifiers class");
		
	}
	void test1() {
		System.out.println("Default Specifiers");
	}
	private void test2()
	{
		System.out.println("Private Specifiers");
	}
	protected static void test3()
	{
		System.out.println("Protected Specifiers");
		
	}
	public static void test4() {
		System.out.println("Static Public Specifiers");
	}
	
}


