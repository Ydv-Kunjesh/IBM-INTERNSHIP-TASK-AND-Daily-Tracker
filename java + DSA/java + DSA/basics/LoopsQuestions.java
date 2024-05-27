
import java.util.Scanner;

public class LoopsQuestions {
    public static void main(String[] args) {
        // Question no.1  Write a program that reads a set of integers,and then prints the sum of the even and odd integers.
        Scanner sc = new Scanner(System.in);
        // long number;
        // int choice ;
        // long oddSum = 0;
        // long evenSum = 0;
        //  do {
        //     number = sc.nextLong();
        //     if (number % 2 == 0) {
        //         evenSum += number;
        //     }
        //     else {
        //         oddSum += number;
        //     }
        //     System.out.println("please enter 1 to continue your task and 0 to terminate this task");
        //     choice = sc.nextInt();
        // } while (choice == 1);
        // System.out.println("sum of Odd numbers are " +  oddSum);
        // System.out.println("sum of even numbers are " +  evenSum);


        // Q no.3 write a program to  find the factorial of the number entered by the user 
        // int number = sc.nextInt();
        // int fact = 1;
        // for (int i = 1; i <= number; i++) {
        //     fact *= i;
        // }
        // System.out.println("factorial of the number " + number + " is " + fact);

        //  Qno 4. write a program to check wheather the number is prime number or not.
       System.out.println("Enter a positive number to check weather the number is prime or not prime");
       int num = sc.nextInt();
       boolean isPrime = true ;
       for (int i = 2; i <= num - 1; i++) {
           if (num % i == 0) {
               isPrime = false;
               // System.out.println("The number " + num + " is not a prime number");
           }
       }
    //    System.out.println(isPrime);
        if (isPrime == true) {
                    System.out.println("Number " + num + " is a prime number");
        }else {
            System.out.println("Number " + num + " is not a prime number"); 
            }
        
        
        
    }
}
