import java.io.*;

public class Q3 {
    // Q#. Write a java program to Get the size of give file in bytes, kilobytes and megabytes
    public static void main(String[] args) {
        String filePath = "trail.txt"; 

        File file = new File(filePath);

        if (file.exists() && file.isFile()) {
            long fileSizeInBytes = file.length();
            double fileSizeInKilobytes = fileSizeInBytes / 1024.0;
            double fileSizeInMegabytes = fileSizeInKilobytes / 1024.0;

            System.out.println("File size in bytes: " + fileSizeInBytes + " bytes");
            System.out.println(String.format("File size in kilobytes: %.2f KB", fileSizeInKilobytes));
            System.out.println(String.format("File size in megabytes: %.2f MB", fileSizeInMegabytes));
        } else {
            System.err.println("File does not exist or is not a valid file.");
        }
    }

}
