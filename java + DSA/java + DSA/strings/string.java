

public class string {
    public static boolean isPalindrome(String s) {
        for (int i=0; i<s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        // String name = "Kunjesh"; // Decleration
        // String name2 = new String("Kunjesh"); // Decleration with new keyword 
        // strings are immutable they cant be changed we create a new object of that string
        // char c = name.charAt(1);
        // System.out.println(c);

        //check is palindrome
        // String s = "momma";
        // isPalindrome(s);
        // if(isPalindrome(s)) {
        // System.out.println("palindrome");
        // } else {
        // System.out.println("not palindrome");
        // }

        // decleration of string using new keyword and without new keyword 
        // String name = new String("Kunjesh");
        // String name2 = "Kunjesh";
        // String name3 = "Kunjesh";
        // System.out.println(name == name2); // it will return false coz we used new keyword to declare a string which makes it different object of string 
        // System.out.println(name.equals(name2)); // returns true because we used equals method to compare two strings
        // System.out.println(name2 == name3); // it will return true coz we used new keyword to declare a string which makes it same object of string

        // System.out.println(name3.substring(0,3)); //substring method builtinmethod
       int a =10;
       if (a < 20) {
           a++;
       }
        
    }   
}
