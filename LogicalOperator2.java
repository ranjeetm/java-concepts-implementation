import java.util.Scanner;
public class LogicalOperator2 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter 'Q' or 'q' to quit the game:");
		String response = sc.next();
		
		if(response.equals("Q")||response.equals("q")) {
			System.out.println("You quit the Game");
		}
		else {
			System.out.println("You didnt quit the game!!!");
		}
		
		
	}

}
