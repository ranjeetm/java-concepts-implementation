import java.util.Scanner;



public class Input {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Enter Your NAme:");
		String name = sc.nextLine();
		System.out.println("Enter Your age :");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Yor Fav Food");
		String FavFood = sc.nextLine();
		
		System.out.println("Your name is:"+ name);
		System.out.println("Your are "+age+"old!!!");
		System.out.println("You like"+FavFood);
		
		

	}

}
