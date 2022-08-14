package MethodPracticeStudy;

public class NonStaParastudy {

	public static void main(String[] args) {
		// calling non static parameter method in same class 
		NonStaParastudy a=new NonStaParastudy();	
a.studentInfo("Sidhant",10, 'A', 'M', 120.5f);
		a.studentInfo("Khushi", 20, 'B', 'F', 230);
		a.studentInfo("neeraj", 4, 'D', 'M', 43);
		a.studentInfo("rohit", 34, 'S', 'M', 43);
		
		NonParaAnoStudy b= new NonParaAnoStudy();
		b.collage("Velocity", "Pune", 'B', 'A', 2014);
b.collage("Welinker", "Mumbai", 'A', 'C', 1990);
		
		
	}
	// student - name, rollnumber,grade, gender,marks, 

	public void studentInfo(String name,int rolnumber, char grade, char gender, float marks)
	{  
	System.out.println("====================");
//		System.out.println("Student name is : "+name);
//		System.out.println("Student rolnumber is : "+rolnumber);
//		System.out.println("Student grade is : "+grade);
//		System.out.println("Stadent Gender is : "+gender);
//		System.out.println("Studnt marks is : "+marks);
//		
		System.out.println("\nStudent name is="+name+"\nStudent rolnumber is="+rolnumber+"\nStudent grade is="+grade+"\nStadent Gender is="+gender+"\nStudnt marks is ="+marks);
	
	}
}
