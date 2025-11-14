
public class LogicalOperators {

	public static void main(String[] args) {
		// logical operators = used to connect two or more expressions
		//
		//  && = (AND) both conditions must be true 
		//  || = (OR) either condition must be true
		//  !  = (NOT) reverses boolean value of conditions
		
		int temp = 5;
		
		if(temp>=30) {
			System.out.println("It's Hot Outside!");
		}
		else if(temp>=20 && temp<30) {
			System.out.println("It's Warm Outside!");
		}
		else {
			System.out.println("It's Cold!!!");
		}

	}

}
