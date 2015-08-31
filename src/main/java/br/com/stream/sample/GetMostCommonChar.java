package br.com.stream.sample;

import java.util.*;

/**
 * @author Gabriel Francisco - gabfssilva@gmail.com
 */
public class GetMostCommonChar {

    public static char getMostCommonChar(String string) {
        Stream stream = new StreamImpl(string.toCharArray());
        Map<Character, Integer> chars = new LinkedHashMap<Character, Integer>();

        while (stream.hasNext()) {
            final char next = stream.getNext();
            int size = chars.getOrDefault(next, 0);
            ++size;
            chars.put(next, size);
        }

        for (Map.Entry<Character, Integer> entry : chars.entrySet()) {
            if(entry.getValue() == 1){
                return entry.getKey();
            }
        }

        return 0;
    }
}
