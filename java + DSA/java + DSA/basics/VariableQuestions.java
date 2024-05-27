import java.util.Scanner;

public class VariableQuestions {
    
    public static void main(String[] args) {
        Scanner Inputs = new Scanner(System.in);
        // int a = Inputs.nextInt();
        // int b = Inputs.nextInt();
        // int c = Inputs.nextInt();
        // System.out.println((a+b+c)/3);

        // : In a program, input the side of a square. You have to output the area of the square.
        // int side = Inputs.nextInt();
        // System.out.println(side * side);
        
        // : Enter cost of 3 items from the user (using float data type)- a pencil, a pen andan eraser. You have to output the total cost of the items back to the user as their bill.
        // // (Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)
        // float pencil = Inputs.nextFloat();
        // float pen = Inputs.nextFloat();
        // float eraser = Inputs.nextFloat();
        // // for 18%  gst tax
        // float gst = (pencil + pen + eraser) * 0.18f;
        // System.out.println((pencil + pen + eraser) + gst);

        // Will the following statement give any error in Java?
        // int $ = 24
        int $ = Inputs.nextInt(); 
        System.out.println($);
    }
}
