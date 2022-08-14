package VariableType;

public class HRStudy {

	public static void main(String[] args) {
		
		EmployeeParaType.Team="INDIA";
		EmployeeParaType.Team="Aus";// taking latest value of static vsriable
		System.out.println("My Team name is "+EmployeeParaType.Team);
		System.out.println("<<<<<<<<<<<<,,,,");
	EmployeeParaType Neeraj =new EmployeeParaType();
Neeraj.emp_name="Neeraj T";
Neeraj.emp_Designation="IT consultant";
Neeraj.emp_EmploId="Vcss1617";
Neeraj.emp_Gender='M';
Neeraj.emp_Age=28;
Neeraj.emp_salary=37000.5f;

Neeraj.emplo_Info();

EmployeeParaType Dheeraj=new EmployeeParaType();
Dheeraj.emp_name="Dheeraj T";
Dheeraj.emp_Designation="Pharmasist";
Dheeraj.emp_EmploId="Vcs43343";
Dheeraj.emp_Gender='M';
Dheeraj.emp_Age=25;
Dheeraj.emp_salary=4900.5f;
Dheeraj.emplo_Info();


	}
	

}
