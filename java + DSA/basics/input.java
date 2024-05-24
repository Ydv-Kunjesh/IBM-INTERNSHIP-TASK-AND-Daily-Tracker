import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // int a = input.nextInt();
        // int b = input.nextInt();
        // int sum = a + b;
        // System.out.println("Sum of " + a + " and " + b + " is " + sum);
       
        // Scanner input2 = new Scanner(System.in);
        // String name = input2.nextLine();
        // System.out.println("Your name is " + name);

        Scanner input3 = new Scanner(System.in);
        int a = input3.nextInt();
        int b = input3.nextInt();
        int product = a * b;
        System.out.println("Product of " + a + " and " + b + " is " + product);

        Scanner input4 = new Scanner(System.in);
        float radius = input4.nextFloat();
        float area = 3.14f * radius * radius;
        System.out.println("Area of circle with radius " + radius + " is " + area);

        
       
    }
}
