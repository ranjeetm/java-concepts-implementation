
public class Freinds {
	String name;
	static int numberoffreinds ;
	Freinds(String name){
		this.name=name;
		numberoffreinds++;
	}
	
	static void displayFriends() {
		System.out.println("You have "+numberoffreinds+"freinds!!!");
	}
}
