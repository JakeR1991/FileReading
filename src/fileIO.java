import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors

public class fileIO {
    public static void main(String[] args) {
        try { // block of code to try
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) { // block of code to handle error
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
