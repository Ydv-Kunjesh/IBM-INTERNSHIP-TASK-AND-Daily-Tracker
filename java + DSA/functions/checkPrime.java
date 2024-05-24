import java.util.*;
public class checkPrime {
    public static boolean isPrime(int n) {
        boolean isPrime = true;
        for (int num = 2; num <= (n - 1); num++) {
            if (n % num == 0) {
                isPrime = false;
                break;
            }

        }
        return isPrime;

    }

    public static void printPrime(int n) {
        for (int num = 2; num <= n; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPrime(n);
    }
}