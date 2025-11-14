import java.util.ArrayList;
public class ArraysList {

	public static void main(String[] args) {
		
		ArrayList<String> food = new ArrayList<String>();
		
		food.add("pizza");
		food.add("burger");
		food.add("ham");
		
		food.set(0, "cheese");
		food.remove(2);
		
		for(int i=0; i<food.size(); i++)
			System.out.println(food.get(i));
			
		}
		
		

	}


