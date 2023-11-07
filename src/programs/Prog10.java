package programs;
import java.util.Scanner;
public class Prog10 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n : ");
        int n=s.nextInt();
        for (int i = 2; n > 1; i++) {
            if (n % i == 0) {
                while (n % i == 0) {
                    System.out.print(i + " ");
                    n = n / i;
                }
            }
        }
        System.out.println("testing");
    }
    }


