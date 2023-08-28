import java.util.Scanner;
public class AreaofCircle {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
	    System.out.print("Enter the radius of the circle: ");
	    
	    double radius = scanner.nextDouble();
	        
	    double area = AreaofCircle(radius);
	        
	    System.out.println("The area of the circle is: " + String.format("%.2f", area));
	    
	        
	    scanner.close();
	}
	
	public static double AreaofCircle(double radius) {
		return Math.PI * radius * radius;
		
	}
}
