// IN THIS PROJECT I HAVE USED ABSTRACTION,INHERITANCE,POLLYMOPHIRSM AND ENCAPSULATION
import java.util.*;
//this class is final so this class can't inherited by another class
//and also extends Shape properties into this child class

public final class Rectangle extends Shape {
	
	protected float length;
	protected float breath;
	public void acceptInput() {
	Scanner scan = new Scanner(System.in);
	System.out.println("enter length");
	length = scan.nextFloat();
	System.out.println("enter breath");
	breath = scan.nextFloat();
	}
	
	
	public void compute() {
		area = length * breath;
	}
	
}
