package iasa.lesson6.observer.entity;

public class Document {
    private final int num;
    private static int counter = 0;

    public Document() {
        this.num = ++counter;
    }

    @Override
    public String toString() {
        return "Document #" + num;
    }
}
