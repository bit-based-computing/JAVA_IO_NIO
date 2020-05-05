package NIO;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelRead {
    public static void main(String[] args) {
        FileInputStream fileInputStream = null;
        try{
            fileInputStream = new FileInputStream("input.txt");
            FileChannel fileChannel = fileInputStream.getChannel();
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            while(fileChannel.read(byteBuffer) > 0){
                byteBuffer.flip();

                while(byteBuffer.hasRemaining()){
                    byte b = byteBuffer.get();
                    System.out.println(b);
                }
                byteBuffer.clear();
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
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
