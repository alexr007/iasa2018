package iasa.lesson2.n4;

public class Adder {
    private final int one;
    private final int two;

    public Adder(int one, int two) {
        this.one = one;
        this.two = two;
    }

    public int add() {
        return one+two;
    }
}
