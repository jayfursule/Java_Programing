// IN THIS PROJECT I HAVE USED ABSTRACTION,INHERITANCE,POLLYMOPHIRSM AND ENCAPSULATION
// this class create the get object as input from launch class 

public class Maths {
	public void permit(Shape ref) {
		
		// following are call the methods differently as object send from launch class
		
		ref.acceptInput();
		ref.compute();
		ref.display();
	}
}
