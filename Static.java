
public class Static {

	public static void main(String[] args) {
		// Static = modifier.A single copy of a variable/method
		// is created and shared. The class"owns" the static member
		Freinds freind1 = new Freinds("Spongebob");
		Freinds freind2 = new Freinds("Duck");
		
		System.out.println(Freinds.numberoffreinds);
		System.out.println(freind1.numberoffreinds);
		
		Freinds.displayFriends();
	}

}
