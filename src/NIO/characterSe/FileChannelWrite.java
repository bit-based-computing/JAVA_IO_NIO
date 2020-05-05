package NIO.characterSe;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.channels.FileChannel;
import java.nio.charset.Charset;

public class FileChannelWrite {
    public static void main(String[] args) {
        File outputFile = new File("output.txt");
        String text = "?????? ????";
        Charset charset = Charset.forName("UTF-8");
        try(FileChannel fileChannel = new FileOutputStream(outputFile).getChannel()) {
            CharBuffer charBuffer = CharBuffer.wrap(text);
            ByteBuffer enocdedBuffer = charset.encode(charBuffer);
            fileChannel.write(enocdedBuffer);
        }catch(IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
