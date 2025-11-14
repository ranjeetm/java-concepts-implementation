import java.util.InputMismatchException;
import java.util.Scanner;
public class ExceptionHandling {

	public static void main(String[] args) {
		// exception = an event that occurs during the execution of a program that,
		// disrupts the normal flow of instructions "
		Scanner scanner = new Scanner(System.in);
	try {
		
		
		System.out.println("Enter a Whole Number to Divide: ");
		int x = scanner.nextInt();
		
		System.out.println("Enter a Whole Number to Divide By: ");
		int y = scanner.nextInt();
		
		int z = x/y;
		
		System.out.println("result: "+z);
	}
	catch(ArithmeticException e) {
		System.out.println("YOu cannot divide by Zero!!!");
	}
	catch(InputMismatchException e) {
		System.out.println("Please Enter A valid number:!!!");
	}
	catch(Exception e) {//Catches All Expression
		System.out.println("Something Went Wrong");
	}
	finally {
		System.out.println("This Will Always Print");
		scanner.close();
	}
		
		
		
		
		
		
		
	}

}
