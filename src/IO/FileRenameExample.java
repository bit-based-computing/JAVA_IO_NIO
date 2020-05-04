package IO;

import java.io.File;
import java.io.IOException;

public class FileRenameExample {
    public static void main(String[] args) {
        File oldFile = new File("input.txt");
        File newFile = new File("output.txt");
        if(!oldFile.exists() && !newFile.exists()){
            try{
                oldFile.createNewFile();
            }catch (IOException e){
                System.out.println(e);
            }
        }
        boolean fileRenamed;
        if(oldFile.exists()){
            fileRenamed = oldFile.renameTo(newFile);
        }else{
            fileRenamed = newFile.renameTo(oldFile);
        }
        if(fileRenamed){
            System.out.println("File renamed Success");
        }else{
            System.out.println("File renamed fail");
        }
    }
}
