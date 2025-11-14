import java.util.ArrayList;
public class TwoDArrayList {

	public static void main(String[] args) {
		
		ArrayList<ArrayList<String>> grocery = new ArrayList<>();
		
		ArrayList<String> bakerylist = new ArrayList<>();
		
		bakerylist.add("Bread");
		bakerylist.add("Pasta");
		
		ArrayList<String> producelist = new ArrayList<>();
		
		producelist.add("Tomatoes");
		producelist.add("Onion");
		
		ArrayList<String> drinkslist = new ArrayList<>();
		
		drinkslist.add("Coffee");
		drinkslist.add("Tea");
		
		grocery.add(bakerylist);
		grocery.add(producelist);
		grocery.add(drinkslist);
		
		System.out.println(grocery);
		System.out.println(grocery.get(2).get(1));
		
		
		

	}

}
