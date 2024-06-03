import java.io.*;

public class Q5 {
// Q5. Write a java program to Read a file line by line 

    public static void main(String[] args) {
        String filePath = "trail.txt";

        readFileLineByLine(filePath);
    }

    public static void readFileLineByLine(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            
            bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }
}


