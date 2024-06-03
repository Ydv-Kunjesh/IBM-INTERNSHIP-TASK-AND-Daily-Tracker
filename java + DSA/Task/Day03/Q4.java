 import java.io.*;

 public class Q4 {
    // Q4. Write a java program to Delete a file 
    public static void main(String[] args) {
        String filePath = "deleted.txt"; 
        deleteFile(filePath);
    }
    public static void deleteFile(String filePath) {
        File file = new File(filePath);
        if (file.exists()) {
            if (file.delete()) {
                System.out.println("File deleted successfully.");
            } else {
                System.err.println("Failed to delete the file.");
            }
        } else {
            System.err.println("File does not exist.");
        }
    }
}

    

