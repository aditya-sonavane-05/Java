import java.util.Scanner;

public class Primeno {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Check if the user has entered an integer
        if (!scanner.hasNextInt()) {
            System.out.println("Please enter an integer.");
            return;
        }

        // Read the integer from the user
        int n = scanner.nextInt();

        // Print the prime numbers less than n
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
}

