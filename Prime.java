
import java.util.Scanner;

public class Prime {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for(int i=2;i<n;i++) {
            if(n%i==0){
                System.out.println("not prime number");
                return;

            }
            else{
                System.out.println("prime number");
            }
        }

        
    }
}