class Rectangle{
	private double lenght;
	private double width;

	Rectangle(){    //constructors r by default public
		lenght=-1;
		width=-1;
	}
	Rectangle(double l,double w){
		lenght=l;
		width=w;
	}
	public void setDimension(double l,double w){
		lenght=l;
		width=w;
	}
	public double getLength(){
		return lenght;
	}
	public double getWidth(){
		return width;
	}
	public double area(){
		return lenght*width;
	}
	public double perimeter(){
		return (2*(lenght+width));
	}
	public void print(){
		System.out.println("Lenght = "+ lenght+" width = "+ width+" Area = "+area()+" Perimeter = "+perimeter());
		
	}

}