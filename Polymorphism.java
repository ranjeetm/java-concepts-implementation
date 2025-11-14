
public class Polymorphism {

	public static void main(String[] args) {
		// polymorphism = Greek word for poly-many,morph-form
		// the ability of an object to identify as more than one type
		
		car5 car = new car5();
		speedBoat boat = new speedBoat();
		f1 williams = new f1();
		
		vehicle2[] racers = {car,boat,williams};
		
		for(vehicle2 x: racers) {
			x.go();
		}
	}

}
