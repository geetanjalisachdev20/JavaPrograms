//enterd character is a vowel pr consonent

import java.util.Scanner;

public class VowConso {
    public static void main(String[] args) {
        int i;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a character");
        
        i=(int)s.next();
        if(i=='a'||'e'||'i'||'o'||'u'||'A'||'I'||'E'||'O'||'U')
            System.out.println("Entered character is a vowel");
        else
            System.out.println("entered character is consonent");
    }
}
