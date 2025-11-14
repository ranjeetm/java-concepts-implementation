
public class Interface {

	public static void main(String[] args) {
		// interface = a template that can be applied to a class.
		// similar to inheritance, but specifies what a class has/must do
		// classes can apply more than one interface, inheritance is limited to 1 
		// super class
		
		Rabbit rab = new Rabbit();
		rab.flee();
		
		Hawk hawk = new Hawk();
		hawk.hunt();
		
		Fish f1 = new Fish();
		f1.hunt();

	}

}
