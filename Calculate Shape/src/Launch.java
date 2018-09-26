// IN THIS PROJECT I HAVE USED ABSTRACTION,INHERITANCE,POLLYMOPHIRSM AND ENCAPSULATION
// this is work as main method means all functionality is operated from this class

public class Launch {

	public static void main(String[] args) {
		
		Square sqare = new Square();
		Rectangle rect = new Rectangle();
		Circle circle = new Circle();
		
		Maths math = new Maths();
		
		// following methods are refers the object into Maths.java location
		math.permit(sqare);
		math.permit(rect);
		math.permit(circle);
	}

}
