
import java.util.Scanner;


public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char operation = input.next().charAt(0);
        System.out.println("You have selected " + operation);
        switch(operation) {
            case '+':
                System.out.println("Enter Your number");
                int a = input.nextInt();
                int b = input.nextInt();
                System.out.println(a + b);
                break;
            case '-':
                System.out.println("Enter Your number");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a - b);
                break;
            case '*':
                System.out.println("Enter Your number");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a * b);
                break;
            case '/':
                System.out.println("Enter Your number");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a / b);
                break;
            case '%':
                System.out.println("Enter Your number");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(a % b);
                break;
            case '^':
                System.out.println("Enter Your number");
                a = input.nextInt();
                b = input.nextInt();
                System.out.println(Math.pow(a, b));
                break;
            case '@':
                System.out.println("Enter Your number");
                a = input.nextInt();
                System.out.println(a * a);
                break;
            case '#':
                System.out.println("Enter Your number");
                a = input.nextInt();
                System.out.println(a * a * a);
                break;
            default:
                System.out.println("Please Enter valid operation as of now our calculator in not too much programmed yet");
        }
    }
}