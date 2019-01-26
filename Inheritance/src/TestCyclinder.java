class Circle{
	private double radius;
	private String color;

	Circle(){
		radius=1.0;
		color="red";
	}
	Circle(double radius){
		this.radius=radius;
	}
	Circle(double radius,String color){
		this.radius=radius;
		this.color=color;
	}
	public double getRadius(){
		return radius;
	}
	public void setRadius(double r){
		radius=r;
	}
	public String getColor(){
		return color;
	}
	public void setColor(String c){
		color=c;
	}
	public double getArea(){
		return 3.14*radius*radius;
	}
}

class Cylinder extends Circle{
	private double height;

	Cylinder(){
		height=1.0;
	}
	Cylinder(double height){
		this.height=height;
	}
	Cylinder(double r,double h){
		super();
		height=h;
	}
	Cylinder(double r,String c,double h){
		super(r,c);
		height=h;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double h){
		height=h;
	}
	public double getVolume(){
		return getArea()*getHeight();
	}
}
class TestCyclinder{
	public static void main(String[] args) {
		Circle c=new Circle();
		Cylinder cy=new Cylinder();
		c.setRadius(5);
		cy.setHeight(3);
		System.out.println("Area of Circle is "+c.getArea());
		System.out.println("Volume of Cylinder is "+cy.getVolume());

		
	}
}