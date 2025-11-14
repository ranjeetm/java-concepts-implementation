import java.util.Scanner;
public class HypotenuseFinding {

	public static void main(String[] args) {
		double x;
		double y;
		double z;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Side x:");
		x = sc.nextDouble();
		System.out.println("Enter Side y:");
		y = sc.nextDouble();
		
		z=Math.sqrt((x*x)+(y*y));
		
		System.out.println("The Hypotenuse is "+z );
		
		

	}

}
