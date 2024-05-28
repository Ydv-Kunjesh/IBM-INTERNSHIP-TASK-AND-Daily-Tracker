public class array {
    public static void main(String[] args) {
        //To create  array in java 
        // Datatype arrayName[] = new datatype[size of array]
        int marks[] = new int[50];
        int number[] = { 1, 2, 3 };
        int moreNumbers[] = { 4, 5, 6 };
        String fruits[] = { "Apple", "Banana", "Mango", "PineApple" };

        // to fill the the array using input 
        marks[0] = 60;
        marks[1] = 61;
        marks[2] = 62;
        // System.out.println(marks[1]);
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println(" ");

        // System.out.println("array after update");
        // passingArg(marks);
        // for (int i = 0; i < marks.length; i++) {
        //     System.out.print(marks[i] + " ");
        // }
        // System.out.println();

        //  linear search
        // int arrays[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        // int element = 10;
        // int index = linearSearch(arrays, element);
        // if (index == -1) {
        //     System.out.println("key not found");
        // } else {
        //     System.out.println("The  element is at index " + index);
        // }

    //  finding Largest number in array
                LargestInArray();
    
    
    }

    public static void passingArg(int marks[]) {
        // Passing array as an argument
        // we pass value using two type 
        // 1. pass by value
        // 2. pass by refrence
        // array will be passed as refrence 

        for (int i = 0; i < marks.length; i++) {
            marks[i] = marks[i] + 1;
        }
        // after runninng this loop our array will get updated and their value will get increased by 1 and acessible in main class 

    }
    
    // linear search in array 
    public static int linearSearch(int arrays[], int key) {
        // scanning line by in list is known as linear search 
        // in array we use linear serach to  find the element in an array

        for (int i = 0; i < arrays.length; i++) {
            if (arrays[i] == key) {
                return i;
            }

        }
        return -1;

    }

    public static void LargestInArray() {
        int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int max = 0;
        for (int i = 0; i <= b.length - 1; i++) {
            if (b[i] > max) {
                max = b[i];

            }
        }
        System.out.println("Largest number in array is " + max);
    }

    //Binary search 
    public static void BinarySearch() {
        int b[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 };
        int start = 0;
        int end = b.length - 1;
        int mid = (start + end) / 2;
        int value = 15;
        while (start <= end) {
            if (b[mid] == value) {
                System.out.println("value found at index " + mid);
                break;
            }
            else if (b[mid] < value) {
                start = mid + 1;
            } else if(b[mid] > value) {
                end = mid - 1;
            }

        }
    }
    
     
} 