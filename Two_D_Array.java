 
public class Two_D_Array {

	public static void main(String[] args) {
		// 2D Array = Array of an Array
		// Think of it as a 3x3 matrix
		
		String[][] cars = new String[3][3];
		cars[0][0] = "Camaro";
		cars[0][1] = "Mustang";
		cars[0][2] = "BMW";
		cars[1][0] = "Corvette";
		cars[1][1] = "Mercedes";
		cars[1][2] = "Ferrari";
		cars[2][0] = "Buggati";
		cars[2][1] = "Lambo";
		cars[2][2] = "Rover";
		System.out.println(cars.length);
		for(int i=0; i<cars.length; i++) {
			System.out.println();
			for(int j=0; j<cars[i].length; j++) {
				System.out.println(cars[i][j]);
				
			}
		}

	}

}
