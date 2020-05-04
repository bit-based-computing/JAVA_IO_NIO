package IO.stream.charStream;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class ReaderExample {
    public static void main(String[] args) {
        Reader reader = null;
        try{
            reader = new FileReader("input.txt");
            int c;
            while((c = reader.read()) != -1){
                System.out.print((char) c);
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            if(reader != null){
                try{
                    reader.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
