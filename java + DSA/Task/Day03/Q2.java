
  import java.io.*;


public class Q2 {
//   Q2. Write a java program to Read content from file using BufferedReader 

    public static void main(String[] args) {
        String filePath = "trail.txt";

        readFromFile(filePath);
    }

    public static void readFromFile(String filePath) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
              
                System.out.println(line);
            }
        } catch (IOException e) {
            System.err.println("An error occurred while reading the file: " + e.getMessage());
        } 
    }
}

