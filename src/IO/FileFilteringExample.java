package IO;

import java.io.File;
import java.io.FileFilter;

public class FileFilteringExample {
    public static void main(String[] args) {
        File file1   = new File(System.getProperty("user.dir"));
        FileFilter txtFilter = new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                String path = pathname.getPath();
                if(path.endsWith(".txt"))return true;
                return false;
            }
        };
        // By anonymous inner class
        File[] files1 = file1.listFiles(txtFilter);

        //By lambda expression
        File[] files2 = file1.listFiles((File file)->{
            String path = file.getPath();
            if(path.endsWith(".txt"))return false;
            return true;
        }
    );
        for(File file: files1){
            System.out.println(file.getPath());
        }
        System.out.println("Second list : ");
        for(File file: files2){
            System.out.println(file.getPath());
        }

    }
}
