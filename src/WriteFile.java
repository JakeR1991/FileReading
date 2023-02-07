import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors

public class WriteFile {
    public static void main(String[] args) {
        try {
            FileWriter myWriter = new FileWriter("filename.txt", true);
            myWriter.write( "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Etiam scelerisque, magna sit amet varius laoreet, nisi tortor pretium dui, in scelerisque nunc purus at erat. Phasellus scelerisque, lectus non vehicula interdum, lacus ex suscipit sapien, eu eleifend lectus elit in leo. Quisque ullamcorper, ligula vel varius tempus, quam nulla gravida ligula, in ultrices nisi nibh vel eros. Suspendisse potenti. In dignissim consectetur nunc, eu convallis massa aliquet ultricies. Pellentesque eget risus augue. Sed luctus nisi nulla, id blandit elit accumsan ultrices. Etiam sit amet ante dui. Nullam viverra pretium velit, sed egestas nisl tristique vel. Aliquam erat volutpat.  \n Aenean auctor metus vel pretium faucibus. Donec eget felis et orci posuere posuere. Phasellus vel feugiat quam.");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
