import java.util.Scanner;

public class FloatCom {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first no");
        Float a=sc.nextFloat();
        System.out.println("Enter second no.");
        Float b=sc.nextFloat();
        //float c,d;
        if((a*1000)>(b*1000))
            System.out.println("fisrt no. is bigger");
        else
            System.out.println("second no.is bigger");
        
    }
    
}
