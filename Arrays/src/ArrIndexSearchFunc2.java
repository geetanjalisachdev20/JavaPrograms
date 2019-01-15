import java.util.Scanner;
class ArrIndexSearchFunc2
{
	 static int search(int []a,int item)
	{
	int i;
	for(i=0;i<a.length;i++)
	{
       if(item==a[i])
       	return i;
	}
	return -1;
	}
	public static void main(String[] args) {
		int a[]=new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the elements of array");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Enter the element u want to search");
		int item=sc.nextInt();
		int s=search(a,item);
		if(s==-1)
			System.out.println("element not found");
		else
			System.out.println("element at location"+s);
		
	}
}