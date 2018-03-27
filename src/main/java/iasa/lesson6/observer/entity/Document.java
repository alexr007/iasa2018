package iasa.lesson6.observer.entity;

public class Document {
    private final int issue;
    private static int counter = 0;

    public Document() {
        this.issue = ++counter;
    }

    @Override
    public String toString() {
        return "Document #" + issue;
    }
}
