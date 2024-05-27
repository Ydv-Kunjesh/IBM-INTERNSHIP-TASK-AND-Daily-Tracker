
import java.util.Scanner;

public class Functionquestions {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter three numbers to find their average: ");
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int c = input.nextInt();
        // avg(a, b, c);

        // QUESTION NUMBER 2
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number to check if it is even: ");
        // int q = input.nextInt();
        // boolean result = isEven(q);
        // System.out.println("The result is " + result);

        // QUESTION NUMBER 3
        // Scanner input = new Scanner(System.in);
        // System.out.println("Enter a number to check if it is palindrome: ");
        // String n = input.nextLine();
        // isPalindrome(n);

        // QUESTION NUMBER 4
        int a = 10;
        int b = 20;

        // System.out.println(Math.max(a, b));
        // System.out.println(Math.min(a, b));
        // System.out.println(Math.sqrt(a));
        // System.out.println(Math.pow(a, b));
        // // System.out.println(Math.avg(a, b));
        // System.out.println(Math.abs(a));

        // question number 5
        sumofdigit(3);
    }

    // Write a Java method to compute the average of three numbers
    // public static void avg(int a, int b, int c) {
    //     {
    //         System.out.println("The average is " + (a + b + c) / 3);
    //     }
    // }

    //  Write a method named isEven that accepts an int argument. The metho dshould return true if the argument is even, or false otherwise. Also write a program to test your method
    // public static boolean isEven(int q) {
    //     if (q % 2 == 0) {
    //        return true;
    //     } else {
    //         return false;
    //     }

    // }

    // Write a Java program to check if a number is a palindrome in Java?
    // public static void isPalindrome(String n) {
    //     String str = n;
    //     String rev = "";
    //     for(int i = str.length() - 1; i >= 0; i--) {
    //         rev = rev + str.charAt(i);
    //     }
    //     if(str.equals(rev)) {
    //         System.out.println("The number is a palindrome");
    //     } else {
    //         System.out.println("The number is not a palindrome");
    //     }  

    // }

    //  Write a Java method to compute the sum of the digits in an integer.
    public static void sumofdigit(int num) {
        int sum = 0;
        for (int i = num; num >= 0; num--) {
            sum = sum + num;
        }
        System.out.println(sum);
    }
}