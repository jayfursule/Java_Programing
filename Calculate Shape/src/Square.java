// IN THIS PROJECT I HAVE USED ABSTRACTION,INHERITANCE,POLLYMOPHIRSM AND ENCAPSULATION
import java.util.Scanner;
//this class is final so this class can't inherited by another class
//and also extends Shape properties into this child class

public final class Square extends Shape {
	protected float length;
	public void acceptInput() {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter length");
		length = scan.nextFloat();
		
		}
	public void compute() {
		area = length * length;
	}
		
}
