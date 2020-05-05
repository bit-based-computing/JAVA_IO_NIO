package NIO.characterSe;

import java.nio.charset.Charset;
import java.util.Map;
import java.util.Set;

public class AvailableCharacterSet {
    public static void main(String[] args) {
        Map<String, Charset> map = Charset.availableCharsets();
        Set<String> keys = map.keySet();
        int count = keys.size();
        System.out.println("Number of available character sert : " + count);
        for(String key: keys){
            System.out.println(key);
        }
    }
}
