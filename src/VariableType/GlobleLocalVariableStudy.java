package VariableType;

public class GlobleLocalVariableStudy {

	int a=50;// global variable -non static -as method - declare and initialisation done 
  static int b=10;// global variable -static - work as method 
	
	public static void main(String[] args) {
	GlobleLocalVariableStudy G=new GlobleLocalVariableStudy();
	G.test();
test2();
System.out.println(">>>>>>>>....");
System.out.println("Value of global non static variable a is "+G.a);
System.out.println("Value of global static variable b is "+b);
int sum=50+G.a; //non static global variable in same class // method 
System.out.println("<<<<<<<<<<");
System.out.println("Global Value of SUM is "+sum);
int sub=100-b; // static global variable in same class // method
System.out.println("Global value of SUB is "+sub);
Sample S=new Sample(); // create object for another class 
System.out.println("<<<<<<<<<<");
System.out.println("Global non static variable of another class is "+S.p);
System.out.println("Global static variable of another class is "+Sample.q);

	}
	
public void test() {
	int a=10;
	int b=20;
	int sum=a+b;
	
	System.out.println("Value of sum is "+sum);

}
public static void test2() {
	
	int a=100-b;
	System.out.println("Value of Sub is "+a);
}

}
