package controlStatementStudy;

public class NestedIfStudy {

	public static void main(String[] args) {
		// If UN is COrrect then Correct UN  enter password
		//If PW is Correct then Correct PW enter Submit or login
		//IF PW is incorrect then Invalid Password 
		//If UN is incorrect then  Invalid UN 

		String Username="Mumbai";
		String Password="Pune";
		
		
        if(Username=="Mumbai") 
        {
        	{
			System.out.println("Usernae is correct,then Enter password");
		} 
		 if (Password=="Pune") {
			 
			System.out.println("password is correct,Login Successful");
		}
 
	else {
System.out.println("invalid password, please correct password");
		}
	}
	else {
			System.out.println("Invalid Username please enter valid username");
		}
}
}

		
	
	


