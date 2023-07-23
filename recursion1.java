import java.util.*;

public class recursion1 {
        //   public static void natnum(int n) {
        //     if(n==0){
        //         return;
        //     }
        //     System.out.println(n);
        //     natnum(n-1);
        //   }

        public static void sumnatnum(int n,int sum) {
   
            if(n==0){
                System.out.println(sum);
                return;
            }
            sum =sum+ n;
            sumnatnum(n-1,sum);
            

        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // natnum(n);
        sumnatnum(n,0);
    }
}
