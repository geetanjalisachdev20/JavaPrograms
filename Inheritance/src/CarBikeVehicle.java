import java.util.Scanner;
class Vehicle{
	public void display(){
		System.out.println("This is a Vehicle.");
	}
}
class Bike extends Vehicle{
	public void display(){
		System.out.println("This is a Bike.");
	}
}
class Car extends Vehicle{
	public void display(){
		System.out.println("This is a Car.");
	}
}
class CarBikeVehicle{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a no. of tyres : ");
		int a=sc.nextInt();
		switch(a){
			case 2 :
			{
				Bike b=new Bike();
				b.display();
			}
			case 4 : 
			{
				Car c=new Car();
				c.display();
			}
			default : 
			{
				Vehicle v=new Vehicle();
				v.display();
			}
			
		}
	}
}