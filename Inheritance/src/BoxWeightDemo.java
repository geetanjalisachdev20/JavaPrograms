class Box{
	private double width;
	private double height;
	private double depth;

	Box(){
		width=1.0;
		height=1.0;
		depth=1.0;
	}
	Box(double w,double h,double d){
		width=w;
		height=h;
		depth=d;
	}
	public double getWidth(){
		return width;
	}
	public void setWidth(double w){
		width=w;
	}
	public double getHeight(){
		return height;
	}
	public void setHeight(double h){
		height=h;
	}
	public double getDepth(){
		return depth;
	}
	public void setDepth(double d){
		depth=d;
	}
	public void display(){
		System.out.println("Volume of box is : "+(width*height*depth));
	}
	
}

class BoxWeight extends Box{
	private double weight;

	BoxWeight(){
		super();
		weight=	1.0;
	}
	BoxWeight(double w,double h,double d,double wg){
		super(w,h,d);
		weight=wg;
	}
	public double getWeight(){
		return weight;
	}
	public void setWeight(double w){
		weight=w;
	}
	public void display(){
		System.out.println("Weight of box is : " +weight);
	}
}

class BoxWeightDemo{
	public static void main(String[] args) {
		Box b=new Box(3,4,5);
		BoxWeight bw=new BoxWeight();
		bw.setWeight(6);
		b.display();
		bw.display();
	}
}