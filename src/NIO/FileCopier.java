package NIO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

public class FileCopier {
    public static void main(String[] args) {
        File sourceFile = new File("input.txt");
        File sinkFile = new File("output.txt");
        copy(sourceFile, sinkFile);
    }

    public static void copy(File sourceFile, File sinkFile) {
        if (!sourceFile.exists() || !sinkFile.exists()) {
            System.out.println("Source or destination not exist");
        }
        // try-with-resource java 7 feature
        try (
                FileChannel sourceChanel = new FileInputStream(sourceFile).getChannel();
                FileChannel sinkChanel = new FileOutputStream(sinkFile).getChannel()
        ) {
            sourceChanel.transferTo(0, sourceChanel.size(), sinkChanel);
            // have another method transferForm() to call from sink
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
