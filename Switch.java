import java.util.Scanner;
public class Switch {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter day:");
		String day = sc.nextLine();
		
		switch(day) {
		case "Sunday":System.out.println("Holiday!!!");
		break;
		case "Monday":System.out.println("Work!!!");
		break;
		case "Tuesday":System.out.println("Work2!!!");
		break;
		case "Wednesday":System.out.println("Work3!!!");
		break;
		case "Thursday":System.out.println("Work4!!!");
		break;
		case "Friday":System.out.println("Work5!!!");
		break;
		case "Saturday":System.out.println("Holiday!!!");
		break;
		default:
			System.out.println("NOt a day");
		
		}
	}

}
