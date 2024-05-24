public class task {
    public static void task1() {
        // Q1. 1. WAP to Swap Two Numbers in java. 
        int a = 10;
        int b = 20;
        System.out.println("value of a before swapping: " + a);
        System.out.println("value of b before swapping: " + b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("value of a after swapping: " + a);
        System.out.println("value of b after swapping: " + b);
    }

    public static int task2(int n) {
        // 2. WAP to convert Integer numbers and Binary numbers in java
        int dec = 0;
        int base = 0;
        while (n > 0) {
            int lastdigit = n % 10;
            n = n / 10;
            dec = dec + lastdigit * base;
            base++;
        }
        System.out.println("The decimal number is " + dec);
        return dec;
    }
    
    public static void task3() {
        // 3. WAP to Find Factorial of a Number in Java
        int number = 5;
        int fact = 1;
        for (int i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.println("Factorial of the number " + number + " is " + fact);
    }

    public static void task4() {
        // 4. WAP to Add two Complex Numbers in Java.
       
    }

    public static int task5(int principal) {
        // 5. WAP to Calculate Simple Interest in Java
        int p = principal;
        int r = 10;
        int t = 2;
        int si = (p * r * t) / 100;
        System.out.println(si);
        return si;
    }

    
    public static void main(String[] args) {
       
        task1();
        task2(10110);
        task3();
        task4();
        task5(10000);

    }
}
