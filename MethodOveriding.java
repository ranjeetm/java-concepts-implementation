
public class MethodOveriding {

	public static void main(String[] args) {
		// Method Overriding = Declaring a method in sub class,
		// which is already present in parent class.
		// done so that a child class can be given its own implementation 
		Dog d1 = new Dog();
		d1.speak();
		Animal a1 = new Animal();
		a1.speak();

	}

}
