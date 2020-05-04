package IO;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandardIOExample {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        while(!"quit".equals(line)){
            System.out.println( line.toUpperCase());
            line = bufferedReader.readLine();
        }
    }
}
