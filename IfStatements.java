import java.util.Scanner;
public class IfStatements {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Your Age: ");
		
		int age = sc.nextInt();
		
		if(age>75){
			System.out.println("You are a Boomer!");
		}
		else if(age<18) {
			System.out.println("You are a Teenager!");
		}
		else if (age>=18) {
			System.out.println("You are a Adult");
		}else {
			System.out.println("Your small");
		}
		

	}

}
