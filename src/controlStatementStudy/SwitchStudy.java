package controlStatementStudy;

public class SwitchStudy {

	public static void main(String[] args) {
		// A--> >90
//		B--> >=66-<90
//		C
//		D 
	
		char Grade='5';
		
		switch (Grade) {
		case 'M':System.out.println("I got >90 %");
	break;
		case 'B':System.out.println("I got>=66 to <90");
	break;
		case 'C':System.out.println("I got >=55 to <66");
	break;
		case'D':System.out.println("i got >=55 to <66");
		break;
		default:System.out.println("I was fail");
			break;
		}
	}

}
