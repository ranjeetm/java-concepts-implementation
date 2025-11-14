
public class Encapsulation {

	public static void main(String[] args) {
		//Encapsulation = attributes of a class will be hidden or private
		//                Can be accessed only through methods (getters & setters)
		//				  You Should make attributes private if u don't have a 
		//				  reason to make them to make them public/protected
		
		car4 c1 = new car4("Chevrolet","Camaro",2021);
		car4 c2 = new car4("Lamborgini","Aventador",2022);
		
		//System.out.println(c1.make); cannot run becauz make is private
		
		System.out.println(c1.getMake());

		String make = "Nissan";
		c1.setMake(make);
		System.out.println(c1.getMake());
		
	}

}
