class Year_Week_Day
{
	public static void main(String[] args)
	{
	int a=678;
	float y,w,d;
	y=a/365;
	a=a%365;
	System.out.println("No. of years:"+y);
	w=a/7;
	a=a%7;
	System.out.println("No. of weeks:"+w);
	d=a;
	System.out.println("No. of days:"+d);
	}
}