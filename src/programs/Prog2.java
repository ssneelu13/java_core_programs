package programs;
import java.util.Scanner;
public class Prog2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter a number: ");
        int a=s.nextInt();
        System.out.println("a is: "+a);
        System.out.println("enter a number: ");
        int b=s.nextInt();
        System.out.println("b is :"+b);
        int temp=a;
        a=b;
        System.out.println("after swapping a is: "+a);
        b=temp;
        System.out.println("after swapping b is: "+b);
    }
}
