class Complex{
	private int real;
	int imaginary;
	Complex(){

	}
	Complex(int real,int imaginary){
		this.real=real;
		this.imaginary=imaginary;
	}
	/*Complex add(Complex c){
		Complex cadd=new Complex();
		cadd.real=real+c.real;
		cadd.imaginary=imaginary+c.imaginary;
		return cadd;

	}*/
	int getReal(){
		return real;
	}
	int setReal(int r){
		real=r;
	}



}
class ComplexTestStaticgs{
	public static Complex add(Complex c1,Complex c2){
		Complex c3=new Complex();
		int r=c1.getReal()+c2.getReal();
		c3.setReal(r);
		c3.imaginary=c1.imaginary+c2.imaginary;
		return c3;
	}
		public static void main(String[] args) {
		Complex c1=new Complex(1,2);
		Complex c2=new Complex(6,5);
		Complex c3=new Complex();
		c3=add(c1,c2);
		System.out.println("c1 = "+c1.getReal()+" "+c1.imaginary);
		System.out.println("c2 = "+c2.getReal()+" "+c2.imaginary);
		System.out.println("sum = "+c3.getReal()+" "+c3.imaginary);


	}
}