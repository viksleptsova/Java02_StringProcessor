package org.example;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringProcessorTest {

    @Test
    public void lineCopyTest() {
        String origStr = "няш";
        int n = 3;
        String actual = StringProcessor.copyLine(origStr, n);
        String expected = "няшняшняш";
        assertEquals(expected, actual);
    }

    @Test
    public void lineCopyTest1 (){
        String s = "Вика";
        int n = 3;
        String expected = "ВикаВика";
        assertEquals(expected, StringProcessor.copyLine(s, n));
    }

    @Test
    public void lineCopyNegativeTest() throws IllegalArgumentException {
        String origStr = "няш";
        int n = -5;
        try {
            String actual = StringProcessor.copyLine(origStr, n);
            fail("Expected IllegalArgumentException");

        } catch (IllegalArgumentException e) {
            assertNotEquals("", e.getMessage());
        }

    }

    @Test
    public void lineOccurrenceTest() {
        String firstStr = "синяя синица сильно любит синьку";
        String secondStr = "син";
        int actual = StringProcessor.getQuantityOfOccurrences(firstStr, secondStr);
        int expected = 3;
        assertEquals(expected, actual);

    }

    @Test
    public void lineOccurrenceNullTest() throws NullPointerException {
        try {
            String firstStr = "синяя синица сильно любит синьку";
            String secondStr = null;
            int actual = StringProcessor.getQuantityOfOccurrences(firstStr, secondStr);
            fail("Expected NullPointerException");
        } catch (NullPointerException e) {
            assertNotEquals("", e.getMessage());

        }
    }

    @Test
    public void replaceTest() {
        String inputStr = "TT123NN";
        String actual = StringProcessor.replaceSymbols(inputStr);
        String expected = "TTодиндватриNN";
        assertEquals(expected, actual);
    }

    @Test
    public void delSecondSymbolEmptyTest() {
        StringBuilder eamptyString = new StringBuilder("");
        StringProcessor.delSecondSymbol(eamptyString);
        String actual = new String(eamptyString);
        String expected = "";
        assertEquals(expected, actual);
    }

    @Test
    public void delSecondSymbolTest() {
        StringBuilder someString = new StringBuilder("КкОоТтИиКк");
        StringProcessor.delSecondSymbol(someString);
        String actual = new String(someString);
        String expected = "КОТИК";
        assertEquals(expected, actual);
    }

    @Test
    public void reverseTest(){
        assertEquals(" ccc  bbb   aa  ",StringProcessor.reverse(" aa  bbb   ccc  ") );
    }

}
