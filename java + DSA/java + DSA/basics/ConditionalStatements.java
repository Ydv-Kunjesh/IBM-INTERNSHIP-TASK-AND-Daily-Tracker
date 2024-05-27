import java.util.*;

public class ConditionalStatements {
    public static void main(String[] args) {
        // Question no.1  Write a Java program to get a number from the user and print whether it is positive or negative
        Scanner input = new Scanner(System.in);
        // int number = input.nextInt();
        // if (number % 2 == 0) {''
        //     System.out.println("The Given input is even number ");
        // }
        // else {
        //     System.out.println("The Given Number is an od number");
        // }

        // Question no2. Finish the following code so that it prints you have a feverif your a fever if your tempreature is above 100 and otherwise prints you donts have a fever 
        // double temp = input.nextDouble();
        // if (temp > 100) {
        //     System.out.println("You have Fever");
        // }
        // else {
        //     System.err.println("Feel Free you are in safe zone");
        // } 

        // Question  no.03 write a java program to input week number (1-7) and print day of week name using switch case  
        // int day = input.nextInt();
        // switch (day) {
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Monday");
        //         break;
        //     case 3:
        //         System.out.println("Tuesday");
        //         break;
        //     case 4:
        //         System.out.println("Wednesday");
        //         break;
        //     case 5:
        //         System.out.println("Thrusday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Invalid Input");
        // }

        // Question no.3 what will be the value of X and y in the following program 
        // int a = 63, b = 36;
        // boolean x = (a < b) ? true : false;
        // // False 
        // int y = (a > b) ? a : b;
        // System.out.println(x + " " + y);
        // 63 

        // Question no 05.  Write a Java program that takes a year from the user and print whether that year is a leap year or not
        long year = input.nextLong();
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            System.out.println(year + " is a leap year");
        }
        else {
            System.out.println(year + " is not a leap year");
        }  
    }
}
