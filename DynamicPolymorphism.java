import java.util.Scanner;
public class DynamicPolymorphism {
	public static void main(String[] args) {
		
		//polymorphism = many shapes/forms
		// dynamic = after compilation(during runtime)
		
		//ex: A corvette is a :corvette,and a car and a vehicle, and an object
		Animal1 animal;
		System.out.println("Enter Dog or Cat");
		int input ;
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		
		if(input==1) { 
			animal = new Dog1() ;
			animal.speak();	
		}
		else if(input==2) { 
			animal = new Cat() ;
			animal.speak();	
		}
		else {
			animal = new Animal1();
			animal.speak();
		}

		
		
		
	}

}
