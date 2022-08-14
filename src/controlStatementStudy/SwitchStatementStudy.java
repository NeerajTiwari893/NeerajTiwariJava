package controlStatementStudy;

public class SwitchStatementStudy {

	public static void main(String[] args) {
		///if today is Monday --> this is 1st day of week
	//sunday--> this is 7th day of week

		String Day="Sunday";
		
		switch (Day) {
		case "Monday":System.out.println("This is 1st day of week");
		break;
		case "Tuesday":System.out.println("This is 2st day of week");
	break;
		case"Wednesday":System.out.println("This is 3rd day of week");
		break;
		case"Thursday":System.out.println("This is 4rth day of week");
		break;
		case "Friday":System.out.println("This is 5th day of week");
	break;
		case"Saturday":System.out.println("This is 6th day of week");
		break;
		case"Sunday":System.out.println("This is 7th day of week");
		
		default:
			break;
		}
		
	}

}
