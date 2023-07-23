import java.util.*;

public class fibonacci {

    public static void fibprint(int a , int b , int n) {
        if(n == 0) {
            return;
        }
        System.out.println(a);
        fibprint(b, a+b, n-1);
    }
        
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        fibprint(0,1,n);
        
    }
    
    
}
