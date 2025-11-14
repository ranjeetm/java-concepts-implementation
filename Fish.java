
public class Fish implements Prey,Predator {

	@Override
	public void hunt() {
		System.out.println("This Fish is Hunting smaller Fish");
		
	}

	@Override
	public void flee() {
		System.out.println("This fish is Fleeing from larger fish");
		
	}
	

}
