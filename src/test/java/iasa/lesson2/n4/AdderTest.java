package iasa.lesson2.n4;

import org.junit.Test;

import static org.junit.Assert.*;

public class AdderTest {

    @Test
    public void add() {
        assertEquals(5, new Adder(2,3).add());
    }

    @Test
    public void add1() {
        assertEquals(0, new Adder(-2,2).add());
    }

    @Test
    public void add3() {
        assertEquals(0, new Adder(-2,3).add());
    }

}