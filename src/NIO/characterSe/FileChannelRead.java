package NIO.characterSe;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class FileChannelRead {
    public static void main(String[] args) {
        File sourceFile = new File("input.txt");
        try(FileChannel fileChannel = new FileInputStream(sourceFile).getChannel()){
            ByteBuffer byteBuffer = ByteBuffer.allocate(1024);
            Charset charset = Charset.forName("UTF-8");
            while (fileChannel.read(byteBuffer) > 0){
                byteBuffer.flip();
                CharBuffer charBuffer = charset.decode(byteBuffer);
                while(charBuffer.hasRemaining()){
                    char achar = charBuffer.get();
                    System.out.println(achar);
                }
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
