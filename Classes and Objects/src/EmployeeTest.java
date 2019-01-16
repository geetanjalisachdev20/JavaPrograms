//first name ,last name and salary of employee using parameterised and non-parametrised constructor
import java.util.Scanner;
class Employee{
	String fname,lname;
	double sal;
	Employee()
	{
		sal=100000;
		fname="Geetanjali";
		lname="Sachdev";
	}
	Employee(String fname,String lname,double sal)
	{
		this.fname=fname;
		this.lname=lname;
		this.sal=sal;
	}
	void displayDetails()
	{
		System.out.println("First name "+fname+" Last name "+lname+" salary "+sal);
	}
	void increaseSal(){
		sal=sal+sal*0.1;
		System.out.println("Increased salary by 10% "+sal);
	}
	void yearlySal(){
		double ysal=sal*12;
		System.out.println("Yearly salaryof employee is "+ysal);
	}


}
class EmployeeTest{
	public static void main(String[] args) {
		 Employee e=new Employee();
        e.displayDetails();
		

		Scanner sc=new Scanner(System.in);
		double sl;
		System.out.println("enter first name of the employee");
		String fn=sc.next();
		System.out.println("enter last name of the employee");
		String ln=sc.next();
		System.out.println("enter salary of the employee");
	    sl=sc.nextDouble();
		if(sl<0){
			System.out.println("re-enter salary of the employee");
	        sl=sc.nextDouble();
	    }
	        
       Employee e1=new Employee(fn,ln,sl);
		e1.displayDetails();
		e1.increaseSal();
		e1.yearlySal();
	}
}