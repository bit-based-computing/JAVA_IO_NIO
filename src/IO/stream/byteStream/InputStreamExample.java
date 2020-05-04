package IO.stream.byteStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("input.txt");
            int c;
            while((c = fileInputStream.read())!=-1){
                System.out.println(c + " " +(char) c);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally{
            if(fileInputStream != null){
                try{
                    fileInputStream.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
