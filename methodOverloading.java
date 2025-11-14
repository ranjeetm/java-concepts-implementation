
public class methodOverloading {

	public static void main(String[] args) {
	
		double x = add(1.0,2.0,3.0,4.0);
		System.out.println(x);
	}
	static int add(int a, int b) {
		System.out.println("Method1");
		return a+b;
	}
	static int add(int a, int b, int c) {
		System.out.println("Method2");
		return a+b;
	}

	static int add(int a, int b, int c, int d) {
		System.out.println("Method3");
		return a+b;
	}

	static double add(double a, double b) {
		System.out.println("Method4");
		return a+b;
	}


}
