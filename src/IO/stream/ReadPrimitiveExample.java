package IO.stream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadPrimitiveExample {
    public static void main(String[] args) {
        DataInputStream dataInputStream;
        try{
            dataInputStream = new DataInputStream(new FileInputStream("primitivesInput.data"));
            int intValue = dataInputStream.readInt();
            Double doubleValue = dataInputStream.readDouble();
            System.out.println(intValue);
            System.out.println(doubleValue);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
