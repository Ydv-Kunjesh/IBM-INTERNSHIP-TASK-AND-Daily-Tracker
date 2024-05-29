
import java.util.Scanner;

public class arraycreation{
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        System.out.println("Enter an array of length 3x3");
        Scanner inp = new Scanner(System.in);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = inp.nextInt();
            }
        }
        // output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.err.println();
        }
        // int z = matrix.length;
        // System.out.println(z);

        search(matrix, 10); // calling search method
    }
    // new method to search the element index of our multidimensional array
    public static boolean search(int matrix[][],int key) {
        for (int i = 0; i <matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == key) {
                    System.out.println("found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        return false;
    }
}