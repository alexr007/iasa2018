package iasa.lesson6.observer.entity;

public class Document {
    private final int num;

    public Document(int n) {
        this.num=n;
    }

    @Override
    public String toString() {
        return "Document #" + this.num;
    }
}
