package IO;

import java.io.File;

public class FileDeleteExample {
    public static void main(String[] args) {
        File file = new File("output.txt");
        file.delete();

        // to delete the when the javm terminates
        File file2 = new File("input.txt");
        file2.deleteOnExit();
    }
}
