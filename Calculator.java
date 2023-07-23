/**
 * one
 */
import java.util.*;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of first number");

        int a = sc.nextInt();
        System.out.println("enter value of second number");
        int b = sc.nextInt();
        System.out.println("Press 1 for Addition");
        System.out.println("Press 2 for Subtraction");
        System.out.println("Press 3 for Multiplication");
        System.out.println("Press 4 for Division");
        int button = sc.nextInt();
        switch(button) {
            case 1 : System.out.println(a+b);
            break;
            case 2 : System.out.println(a-b);
            break;
            case 3 : System.out.println(a*b);
            break;
            case 4 : System.out.println(a/b);
            break;
            default: System.out.println("invalid");
        }

        

    }
}