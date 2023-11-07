package programs;
import java.util.Scanner;
public class Prog7 {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        System.out.println("enter the number of times to flip the coin: ");
        int coin_flip=s.nextInt();
        int head_count=0;
        int tail_count=0;
        float max=1;//define the range
        float min=0;
        float range=max-min;
        for(int i=0;i<coin_flip;i++){
            double random=Math.random();
            System.out.println(random);
            if(random<0.5){
                tail_count++;
            }
            else{
                head_count++;
            }
        }
        int head_percentage=(head_count/coin_flip)*100;
        int tail_percentage=(tail_count/coin_flip)*100;
        System.out.println("tail %: "+tail_count);
        System.out.println("head %: "+head_count);
    }
}
