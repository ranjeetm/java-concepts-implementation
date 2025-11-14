
public class CopyingObjects {

	public static void main(String[] args) {
		car4 c1 = new car4("Chevrolet","Camaro",2021);
		car4 c2 = new car4("Ford","Mustang",2022);
		//c2 = c1 doesnt work
		c2.copy(c1);
		// OR
		// car4 c2 = new car4(c1);
		
		System.out.println(c2.getMake());
		
	}

}
