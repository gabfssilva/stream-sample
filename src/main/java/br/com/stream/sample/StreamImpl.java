package br.com.stream.sample;

/**
 * @author Gabriel Francisco - gabfssilva@gmail.com
 */
public class StreamImpl implements Stream {
    private char[] chars;
    private int index = -1;

    public StreamImpl(char[] chars) {
        this.chars = chars;
    }

    @Override
    public char getNext() {
        ++index;
        return chars[index];
    }

    @Override
    public boolean hasNext() {
        return index < (chars.length - 1);
    }
}
