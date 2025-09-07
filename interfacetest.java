package OOPs_testing;

interface Shapes{
	double calculateAreas();
}

class Circles implements Shapes{
	int r;
	Circles(int radius){
	r=radius;	
	}
	public double calculateAreas() {
	
		double area= Math.PI*r*r;
		return area;
	}
}
class Rectangles implements Shapes{
	int l,b;
	Rectangles(int length,int breadth){
		l=length;
		b= breadth;
	
	}
	public double calculateAreas() {
		double area=(l*b);
		return area;
	}
}
public class interfacetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Circles c1=new Circles(2);
System.out.println("Area of circle is: "+ c1.calculateAreas());
Rectangles r1=new Rectangles(2,3);
System.out.println("Area of rectnagle is: " + r1.calculateAreas());
	}
}
