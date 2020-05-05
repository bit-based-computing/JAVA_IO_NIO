package IO.stream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class WritePrimitiveExample {
    public static void main(String[] args) {
        DataOutputStream dataOutputStream ;
        try{
            dataOutputStream = new DataOutputStream(new FileOutputStream("primitivesOutput.data"));
            dataOutputStream.writeInt(10);
            dataOutputStream.writeDouble(10.12);
            dataOutputStream.writeBoolean(false);
            dataOutputStream.flush();
            dataOutputStream.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
