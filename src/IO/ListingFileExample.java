package IO;

import java.io.File;

public class ListingFileExample {
    public static void main(String[] args) {
        File file1 = new File(System.getProperty("user.dir"));
        File[] files = file1.listFiles();
        for(File file: files){
            System.out.println(file.getPath());
        }
    }
}
