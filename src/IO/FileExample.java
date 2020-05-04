package IO;

import java.io.File;
import java.io.IOException;

public class FileExample {
    public static void main(String[] args) {
        File file = new File("input.txt");
        if(file.exists()){
            System.out.println("FIle is exist");
        }else{
            try{
                file.createNewFile();
            }catch (IOException e){
                System.out.println(e.getMessage());
            }
        }
        String workingDir = System.getProperty("user.dir");
        System.out.println(workingDir);
        System.out.println("It is file " + file.isFile());
        System.out.println("It is directory " + file.isDirectory());
        String fileSeparator = File.separator; // it return platform url separator like(windows '\', Unix '/')
        System.out.println(fileSeparator);
    }
}
