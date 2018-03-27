package iasa.lesson1.n6;

import org.junit.Test;

import static org.junit.Assert.*;

public class ProcessOneTest {

    @Test
    public void process0() {
        assertEquals("1BC", new ProcessOne().process("1Bc"));
    }

    @Test
    public void process1() {
        assertEquals("ABC", new ProcessOne().process("aBc"));
    }

    @Test
    public void process2() {
        assertEquals("ABC", new ProcessOne().process("abc"));
    }
}