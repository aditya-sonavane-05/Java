import java.util.Scanner;

/**
 * fact
 */
public class fact {

    public static int  factOfNum(int n ) {
        int factor=1;
        for(int i=1;i<n;i++){
             factor = factor*i;

        }
     
        
        return factor;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int factorial = factOfNum(n);
        System.out.println("the factorial of "+ n +" "+"is:"+factorial); 
        
    }
}