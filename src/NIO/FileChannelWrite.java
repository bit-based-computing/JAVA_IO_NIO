package NIO;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelWrite {
    public static void main(String[] args) {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream("output.txt");
            FileChannel fileChannel = fileOutputStream.getChannel();
            String text = "I love you";
            byte[] bytes = text.getBytes();
            ByteBuffer byteBuffer = ByteBuffer.wrap(bytes);
            fileChannel.write(byteBuffer);
            fileChannel.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }finally{
            if(fileOutputStream != null){
                try{
                    fileOutputStream.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
