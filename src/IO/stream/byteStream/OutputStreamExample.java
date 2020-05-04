package IO.stream.byteStream;

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String data = "This is output file";
        try{
            FileOutputStream fileOutputStream = new FileOutputStream("output.txt"); // relative path
            fileOutputStream.write(data.getBytes());
            fileOutputStream.flush();
            fileOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
