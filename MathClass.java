
public class MathClass {
	public static void main(String[] args) {
		double x = 10.234124;
		
		double y = -10.31441;
		
		double z = Math.max(x, y) ;
		
		System.out.println(z);
		
		double c = Math.min(x,y) ;
		double d = Math.abs(y) ; // abs = absolute value without negative
		
		double sqr = Math.sqrt(x) ;
		double r = Math.round(sqr) ;
		double e = Math.ceil(sqr) ;
		double f = Math.floor(sqr) ;
		System.out.println(d);
		System.out.println(sqr);
		System.out.println(r);        
				
		
	}

}
