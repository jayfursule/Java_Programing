//  IN THIS PROJECT I HAVE USED ABSTRACTION,INHERITANCE,POLLYMOPHIRSM AND ENCAPSULATION
//this class is parent class which is abstracted contains abstract method which helps to create empty methods 

public abstract class Shape {
	public float area;
	abstract public void acceptInput();
	abstract public void compute();
	public void display() {
		System.out.println("area is "+area);
	}

}
