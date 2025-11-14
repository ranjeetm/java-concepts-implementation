
public class StringMethods {

	public static void main(String[] args) {
		String name = "   Ranjeet" ;
		
		boolean result = name.equals("Ranjeey");
		
		int length = name.length();
		
		char Char = name.charAt(0);
		
		int index = name.indexOf("a");
		
		boolean result1 = name.isEmpty();
		
		String upper =name.toUpperCase();
		String lower =name.toLowerCase(); 
		
		//trim method is used to remove whitespaces
		
		String name_trim = name.trim();
		
		String replaced = name.replace("a", "o");
		
		System.out.println(name_trim);
		System.out.println(replaced);
		
		System.out.println(upper);
		System.out.println(lower);

	}

}
