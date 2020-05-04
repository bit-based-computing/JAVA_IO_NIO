package IO;

import java.io.File;

public class DirectoryExample {
    public static void main(String[] args) {
        File dir = new File(System.getProperty("user.dir") + File.separator + "test");
        dir.mkdir();
        System.out.println(dir.getPath());
    }
}
