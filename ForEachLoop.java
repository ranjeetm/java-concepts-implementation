import java.util.ArrayList;
public class ForEachLoop {

	public static void main(String[] args) {
		//String[] animals = new String[3] ;
		//animals[0] = "Lion";
		//animals[1] = "Tiger";
		//animals[2] = "Rat";
		
		ArrayList<String> animals = new ArrayList<String>();
		
		animals.add("Lion");
		animals.add("Tiger");
		animals.add("Rat");
		
		
		
		
		for(String i: animals) {
			System.out.println(i);
			 
		}
		

	}

}
