import java.util.*;

public class newTask {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
         // question number 5. Create a class to find out the distance b/w two coordinates. (d=√((x2 – x1)² + (y2 – y1)²).
        // 
        Scanner inp = new Scanner(System.in);
        Corrds first = new Corrds();
        System.out.print("enter value of a1");
        first.a1  = inp.nextDouble();
        System.out.print("enter value of a2");
        first.a2 = inp.nextDouble();
        System.out.print("enter value of b1");
        first.b1 = inp.nextDouble();
        System.out.print("enter value of b2");
        first.b2 = inp.nextDouble();
        first.res();

    }
    static class Corrds {
        double a1;
        double a2;
        double b1;
        double b2;
       
        // double dist =  Math.sqrt(Math.pow(deltaX, 2) + Math.pow(deltaY, 2));
       
        public void res() {    
        double deltaX = (a2 - a1);
        double deltaY = (b2 - b1);
        double dist =Math.sqrt(deltaX * deltaX + deltaY * deltaY); //to find distance b/w coordinates
        System.out.println("("+a1 + "  " + a2 + ") , ( " + b1 + " " + b2 + " )");
        System.out.println("Distance b/w cordinate is " + dist + " Cm ");
        }

    }
}
