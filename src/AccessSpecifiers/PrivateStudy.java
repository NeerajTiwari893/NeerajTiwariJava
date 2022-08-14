package AccessSpecifiers;

public class PrivateStudy {

	public static void main(String[] args) {

		AccessSpefiStudy A=new AccessSpefiStudy();
		A.test();// public specifiers - project 
		A.test1();  //default specifiers - within package 
		A.test3(); // Protected Specifiers - within Package + heplp inheritence 
		//A.test2() // it is private and score of private is with class ionly 

	}
	
}
