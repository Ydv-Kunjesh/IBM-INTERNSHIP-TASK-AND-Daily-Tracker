
import java.util.Scanner;


public class day02 {
   
    static class Person {
        String Name;
        int Age;

        public void Greet() {
            System.out.println("Hello " + Name + " Good Morning " + "your age is " + Age);
        }
    }

    static class Rectangle {
        int length;
        int breadth;

        public void area() {
            System.out.println("Area of your rectangle with length " + length + "cm" + " and breadth " + breadth + "cm "
                    + " is " + length * breadth + "cm");
        }
    }

    static class Circle {
        int radius;
        float pie = (float) Math.PI;

        public void Area() {
            System.out.println("area or cirle with radius " + radius + "Cm" + " is " + 2 * pie * radius + "Cm");
        }

    }

    static class Corrds {
        double a1;
        double a2;
        double b1;
        double b2;
        double deltaX = a2 - a1;
        double deltaY = b2 - b1;

        // float dist = (float) Math.sqrt(deltaX * deltaX + deltaY * deltaY); //to find distance b/w coordinates
        double dist =  Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
        public void res() {
        System.out.println(a1 + " " + a2 + " " + b1 + " " + b2);
            System.out.println("Distance b/w cordinate is" + dist + "Cm");
        }

    }
        
    public static void main(String[] args) {
        // Question No1.  Create a class named Person with attributes name and age. Use Scanner to get user input for a name and age, then create a Person object and greet the user by name and age
        Person p1 = new Person();
        // Scanner Inp = new Scanner(System.in);
        // System.out.print("Hey enter your name: ");
        // p1.Name = Inp.next();
        // System.out.print("Hey enter your Age: ");
        // p1.Age = Inp.nextInt();
        // Inp.close();  a better approach
        //    p1.Greet();   

        // Question no2. Create a class named Rectangle with attributes length and breadth (or width) and methods to calculate and display the area. Use the Scanner class to get user input for the rectangle's dimensions. (Area of Rectangle = Length*Breadth) 

        Rectangle rect = new Rectangle(); //creating new instance on rectangle class
        //    Scanner sc = new Scanner(System.in);
        //    System.out.print("Enter the length of the rectangle in cm : ");
        //    rect.length = sc.nextInt();
        //    System.out.print("Enter the breadth of the rectangle in cm : ");
        //    rect.breadth = sc.nextInt();

        //    rect.area();  // to get output 

        //Question number 3. Create a class named Circle with an attribute radius and a method to calculate the area. Use Scanner to get user input for the circle's radius (Area of Circle = πr*r) 
        Circle circle1 = new Circle();
        // Scanner inp = new Scanner(System.in);
        // System.out.print("Enter the radius of Circle in Cm :");
        // circle1.radius = inp.nextInt();

        // circle1.Area();

        //Question number 4.  Create a class name Calculator which will add, subtract, multiply and divide
        // Scanner input = new Scanner(System.in);
        //  System.out.print("Choose any operation which you want '+,-,x,/': ");
        //     char operation = input.next().charAt(0);
        //     System.out.println("You have selected " + operation);
        //     switch (operation) {
        //         case '+':
        //             System.out.println("Enter Your number");
        //             int a = input.nextInt();
        //             int b = input.nextInt();
        //             System.out.println(a + b);
        //             break;
        //         case '-':
        //             System.out.println("Enter Your number");
        //             a = input.nextInt();
        //             b = input.nextInt();
        //             System.out.println(a - b);
        //             break;
        //         case 'x':
        //             System.out.println("Enter Your number");
        //             a = input.nextInt();
        //             b = input.nextInt();
        //             System.out.println(a * b);
        //             break;
        //         case '/':
        //             System.out.println("Enter Your number");
        //             a = input.nextInt();
        //             b = input.nextInt();
        //             System.out.println(a / b);
        //             break;
        //          default:
        //             System.out.println("Please Enter valid operation as of now our calculator in not too much programmed yet");

        //     }

        // question number 5. Create a class to find out the distance b/w two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).
        // 
        Scanner inp = new Scanner(System.in);
        Corrds first = new Corrds();
        System.out.print("enter value of a1");
        first.a1  = inp.nextInt();
        System.out.print("enter value of a2");
        first.a2 = inp.nextInt();
        System.out.print("enter value of b1");
        first.b1 = inp.nextInt();
        System.out.print("enter value of b2");
        first.b2 = inp.nextInt();
        inp.close();
        first.res();
    
            
    }
}
