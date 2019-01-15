
import java.util.Scanner;

public class User1 {
    public static void main(String[] args) {



    Scanner sc=new Scanner();
    int a=sc.nextInt();
    do {
        switch (a) {
            case 1:
                System.out.println("JAN");
            case 2:
                System.out.println("Feb");
            case 3:
                System.out.println("march");
            case 4:
                System.out.println("april");
            case 5:
                System.out.println("may");
            case 6:
                System.out.println("june");
            case 7:
                System.out.println("july");
            case 8:
                System.out.println("aug");
            case 9:
                System.out.println("sep
");
            case 10:
                System.out.println("oct");
            case 11:
                System.out.println("nov");
            case 12:
                System.out.println("dec");

        }
        System.out.println("do u want to continue if yes type 1");
        int c=sc.nextInt();
    }while(c==1);
}
        }