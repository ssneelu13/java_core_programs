package programs;  //this is a package
import java.util.Scanner;  //used for taking input

public class Prog1 {  //this is a class
    public static void main(String[] args) {
        /*public is a access specifier and static is used to use class without object
        void means returns no value and main means the execution of the program begins from main function*/
        Scanner s=new Scanner(System.in); //for input
        System.out.println("enter a number: "); //for output
        int num1=s.nextInt(); //for input
        System.out.println("enter a number: ");
        int num2=s.nextInt();
        int quotient=num1/num2;
        int remainder=num1%num2;
        System.out.println("the quotient is: " + quotient);
        System.out.println("the remainder is: " + remainder);


    }
}
