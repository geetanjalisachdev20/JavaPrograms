//to display area and circumference of circle using parameterised and non-parameteruised constructor 
import java.util.Scanner;
class Circle{
	double radius;

	Circle(){
		radius=1;
	}
	Circle(double radius){
		this.radius=radius;
	}
	double areaCircle(){
		double a;
		a=(radius*radius*3.141);
		return a;
	}
	double circumCircle(){
		double cir;
		cir=(2*3.14*radius);
		return cir;
	}
	void displayCircle(){
		System.out.println("Area of circle is "+areaCircle()+"\nCircumference of circle is "+circumCircle());
	}
}
class CircleTest{
	public static void main(String[] args) {
		Circle c=new Circle();
		c.displayCircle();
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter radius of the Circle : ");
		double r=sc.nextDouble();
		Circle c1=new Circle(r);
		c1.displayCircle();
	}
}