import java.io.*;

public class bufferin {
    public static void main(String[] args) throws IOException {
        BufferedReader a = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter your name: ");
        String name = a.readLine();
        System.out.println("Your name is " + name);
        System.out.print("Enter your age: ");
        String age = a.readLine();
        int age1 = Integer.parseInt(age); // convert string to integer to make operational 
        System.out.println("Your age is " + age1*2);

    }
     
}
