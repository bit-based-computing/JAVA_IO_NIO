package IO.stream.charStream;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class WriterExample {
    public static void main(String[] args) {
        Writer writer;
        String data = "This is output data";
        try{
            writer = new FileWriter("output.txt");
            writer.write(data);
            writer.flush();
            writer.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
