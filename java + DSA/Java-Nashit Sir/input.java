import java.util.*;
public class input {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); //creating new instance of scanner class which is hold by sc variale
        System.out.println("Enter a number: ");
        int a = sc.nextInt();
        if (a > 18) {
            System.out.println("Age is greater than 18");
        }
        else {
            System.out.println("Age is less than 18");
        }
        // to take string input 
        System.out.println("Enter your name: ");
        String name = sc.next();
        String password = sc.next();
    
        System.out.println("Your name is " + name);
        if (name.equals( "Kunjesh") || password.equals("admin")) {
            System.out.println("Hello Kunjesh you are logged in");
        } else {
            System.out.println("logged out " + name);
        }
        
    }
}