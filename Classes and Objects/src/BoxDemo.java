class Box{
	double width;
	double height;
	double depth;
	Box()
	{
		width=5;
		height=8;
		depth=9;
	}
	Box(double width,double height,double depth)
	{
		this.width=width;
		this.height=height;
		this.depth=depth;
	}
	double volume(){
		return(width*height*depth);

	}
}
class BoxDemo{
	public static void main(String[] args) {
		Box b=new Box();
		Box b1=new Box(4,4,4);
		//b.setDim(); 
		System.out.println("volume with width"+b.width+", height"+b.height+"depth"+b.depth+"is "+b.volume());
		System.out.println("volume is"+b1.volume());
	}
}