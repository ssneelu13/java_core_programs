package programs;
import java.util.Scanner;
public class Prog5 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter a: ");
        int a=s.nextInt();
        System.out.println("enter b: ");
        int b=s.nextInt();
        System.out.println("enter c: ");
        int c=s.nextInt();
        if(a>b && a>c){
            System.out.println("a is greater");
        }
            else if(b>a && b>c){
                System.out.println("b is greater");
            }
        else{
            System.out.println("c is greater");
        }
    }
}
