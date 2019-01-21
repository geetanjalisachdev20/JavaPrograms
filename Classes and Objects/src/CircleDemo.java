class Circle{
	double radius;
	double findArea(){
		return radius*radius*3.141;
	}
	
	void dispalyArea(){
		System.out.println("Area= "+ findArea());
	}
	Circle()
	{
		radius=7;
	}
}
class CircleDemo{
	public static void main(String[] args) {
		Circle c=new Circle();
		//c.radius=5;
		c.dispalyArea();
		
	}
	
}