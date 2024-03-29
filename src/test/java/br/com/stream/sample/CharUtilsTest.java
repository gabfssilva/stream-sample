package br.com.stream.sample;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

/**
 * @author Gabriel Francisco - gabfssilva@gmail.com
 */
public class CharUtilsTest {

    @Test
    public void shouldReturnb() throws Exception {
        final String string = "aAbBABac";
        final char mostCommonChar = CharUtils.getLessCommonChar(string);
        assertThat(mostCommonChar, equalTo('b'));
    }

    @Test
    public void shouldReturnd() throws Exception {
        final String string = "aAbBABdacbciqjanniwkelac";
        final char mostCommonChar = CharUtils.getLessCommonChar(string);
        assertThat(mostCommonChar, equalTo('d'));
    }


    @Test
    public void shouldReturns() throws Exception {
        final String string = "toaislcmklwoetia";
        final char mostCommonChar = CharUtils.getLessCommonChar(string);
        assertThat(mostCommonChar, equalTo('s'));
    }

}