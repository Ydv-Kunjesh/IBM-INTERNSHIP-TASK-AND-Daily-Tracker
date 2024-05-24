import java.util.*;
public class dectobbbinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String binary = dectobinary(n);
        System.out.println(binary);

    }

    public static String dectobinary(int n) {
        String binary = "";
        while (n > 0) {
            int rem = n % 2;
            binary = rem + binary;
            n = n / 2;
        }
        return binary;
    }
}
