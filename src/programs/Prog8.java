package programs;
import java.util.Scanner;

public class Prog8 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of exponent: ");
        int exponent=s.nextInt();
        System.out.println("enter the value of base: ");
        int base=s.nextInt();
        int result=1;
        for(int i=0;i<exponent;i++){
            result=result*base;
        }
        System.out.println(base+"power"+exponent+"="+result);
    }
}
