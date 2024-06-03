
import java.io.*;
public class Q1 {
    // Q1. Write a java program to Append text or string in a file

    public static void main(String[] args) {
        String filePath = "trail.txt";
        String textToAppend = "Text Appended.";

        appendFile(filePath, textToAppend);
    }

    public static void appendFile(String filePath, String textToAppend) {
        FileWriter fileWriter = null;
        try {

            fileWriter = new FileWriter(filePath, true);
            fileWriter.write(textToAppend);
            fileWriter.write(System.lineSeparator()); // Adding new line after the text
            System.out.println("Text appended successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred while appending text to the file: " + e.getMessage());
        } finally {
            try {
                if (fileWriter != null) {
                    fileWriter.close();
                }
            } catch (IOException e) {
                System.err.println("An error occurred while closing the file: " + e.getMessage());
            }
        }
    }

}

