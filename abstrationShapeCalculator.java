package OOPs_testing;

abstract class Shape{
 public abstract void  calculateArea();
 public abstract void calculatePerimeter();// we need to use methods as it is defined in abstract call, we need to override it and then we can overload
}
class Circle extends Shape{
	double radius;
	public void calculateArea() {
		radius=3.14*2*2;
		System.out.println("Area of circle is" + radius);
	}
	public void calculatePerimeter() {
		
	} 
	public void calculateArea(int a) {
		radius= 3.14*a*a;
		System.out.println("Area of circle is " + radius);
	}
	public void calculatePerimeter(int b) {
		System.out.println();
	}
}
class Rectangle extends Shape{
	public void calculateArea() {
	}
	public void calculatePerimeter() {
		
	} 
	public void calculatePerimeter(int l, int b) {
		System.out.println("Perimeter of Rreactnagle is "+ 2*(l+b));
	}
}
public class abstrationShapeCalculator {

	public static void main(String[] args) {
		Circle c= new Circle();
		c.calculateArea(2);
		Rectangle  r= new Rectangle();
		r.calculatePerimeter(2,3);
		

	}

}
