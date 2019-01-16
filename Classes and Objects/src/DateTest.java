//display day,month,year using parameterised and non-paramerised constructor
import java.util.Scanner;
class Date{
	int mon,day,year;
	void displayDate(){
		System.out.println("Day Month Year are as follows:");
		System.out.println(day+"/"+mon+"/"+year);

	}
	Date(){
		mon=1;
		day=1;
		year=2000;
	}
	Date(int day,int mon,int year)
	{
		this.day=day;
		this.mon=mon;
		this.year=year;
	}
}
class DateTest{
	public static void main(String[] args) {
		Date d= new Date();
		d.displayDate();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter day");
		int da=sc.nextInt();
		System.out.println("Enter month");
		int m=sc.nextInt();
		System.out.println("Enter year");
		int y=sc.nextInt();
        Date d1=new Date(da,m,y);
        d1.displayDate();

	}
}