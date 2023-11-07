package programs;
import java.util.Scanner;
public class Prog9 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the value of n: ");
        int n=s.nextInt();
        double sum=0;
        for(int i=1;i<=n;i++){
            System.out.println("1/"+i);
            sum=sum+(double) 1/i;
        }
        System.out.println("sum is: "+sum);
    }
}
