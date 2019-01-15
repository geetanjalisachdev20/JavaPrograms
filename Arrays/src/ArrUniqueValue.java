import java.util.Scanner;

public class ArrUniqueValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[5];
        System.out.println("Enter the elements of Array");
        for(int i=0;i<5;i++)
        {
            arr[i]=sc.nextInt();
            if((10<=arr[i])&&(arr[i]<=100))
                continue;
            else
                arr[i]=sc.nextInt();
        }
        

    }
}
